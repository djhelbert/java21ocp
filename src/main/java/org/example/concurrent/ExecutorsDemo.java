package org.example.concurrent;

import java.util.concurrent.*;

public class ExecutorsDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> future = es.submit(() -> 1 + 1);

        System.out.println(future.get(10, TimeUnit.SECONDS));
        es.shutdownNow();
    }

}
