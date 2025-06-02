package org.example.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class CountDownLatchDemo {
    private static final int COUNT = 5;

    public static void main(String[] args) throws InterruptedException {
        var countDownLatch = new CountDownLatch(COUNT);
        var es = Executors.newFixedThreadPool(2);

        IntStream.range(0, COUNT).forEach(i -> es.submit(new Worker(countDownLatch)));

        countDownLatch.await(); // Wait until latch counts down

        es.shutdownNow();
    }

    private static class Worker implements Runnable {
        private CountDownLatch latch;

        public Worker(CountDownLatch countDownLatch) {
            this.latch = countDownLatch;
        }

        public void run() {
            System.out.println("Counted latch -1");
            latch.countDown();
        }
    }
}