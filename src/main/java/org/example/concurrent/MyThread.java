package org.example.concurrent;

/**
 * Extends the Thread class and overrides run
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread Started");
        try {
            Thread.sleep(10);
            System.out.println("Slept 10ms");
        } catch(InterruptedException err) {
            err.printStackTrace();
        }
        System.out.println("MyThread Complete");
    }
}
