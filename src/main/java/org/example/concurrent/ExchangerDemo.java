package org.example.concurrent;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Executors;

/**
 * The Exchanger class in Java can be used to share objects between two threads of type T.
 * The class provides only a single overloaded method exchange(T).
 * When invoked exchange waits for the other thread in the pair to call it as well. At this point,
 * the second thread finds the first thread is waiting with its object. The thread exchanges the objects they
 * are holding and signals the exchange, and now they can return.
 */
public class ExchangerDemo {

    public static void main(String[] args) throws InterruptedException {
        final Exchanger<String> exchanger = new Exchanger<>(); // Exchanger of Strings

        Runnable run1 = () -> {
            try {
                String msg = exchanger.exchange("Message #1"); // Waits for another thread to arrive at this point
                System.out.println("Received from another thread in task #1: " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable run2 = () -> {
            try {
                String msg = exchanger.exchange("Message #2");  // Waits for another thread to arrive at this point
                System.out.println("Received from another thread in task #2: " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        try (var es = Executors.newCachedThreadPool()) {
            es.submit(run1);
            es.submit(run2);
            es.shutdown();
        }
    }
}