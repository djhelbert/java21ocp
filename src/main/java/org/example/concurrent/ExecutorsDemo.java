package org.example.concurrent;

import java.util.concurrent.*;

public class ExecutorsDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> future = es.submit(() -> 1 + 1);

        es.submit(() -> System.out.println("Runnable"));

        // future.get(); waits until thread is complete
        System.out.println(future.get(10, TimeUnit.SECONDS)); // wait for a period of time
        es.shutdownNow();
    }

}
