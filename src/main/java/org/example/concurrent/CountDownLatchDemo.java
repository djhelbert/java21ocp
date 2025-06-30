package org.example.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * A synchronization aid that allows one or more threads to wait until a set of operations being performed in
 * other threads completes. It prevents any thread from proceeding past an await until all threads could pass.
 */
public class CountDownLatchDemo {
    private static final int COUNT = 5; // The number of required invocations

    public static void main(String[] args) throws InterruptedException {
        var countDownLatch = new CountDownLatch(COUNT);
        var es = Executors.newFixedThreadPool(2);

        IntStream.range(0, COUNT).forEach(i -> es.submit(new Worker(countDownLatch)));

        countDownLatch.await(); // Wait until latch counts down in this case 5

        System.out.println("Invocations have been completed.");

        es.shutdownNow();
    }

    private static class Worker implements Runnable {
        private final CountDownLatch latch;

        public Worker(CountDownLatch countDownLatch) {
            this.latch = countDownLatch;
        }

        public void run() {
            System.out.println("Counted latch " + latch.getCount());
            latch.countDown();
        }
    }
}