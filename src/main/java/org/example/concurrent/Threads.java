package org.example.concurrent;

public class Threads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner() {});
        Thread t2 = new MyThread();
        Thread t3 = new Thread(() -> {System.out.println("Runnable Lambda");});

        t1.setDaemon(true); // JVM will terminate if only daemon threads are running

        t1.start();
        t2.start();
        t3.start();

        try {
            System.out.println("Waiting for t3 to complete...");
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
