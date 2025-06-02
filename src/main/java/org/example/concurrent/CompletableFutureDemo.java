package org.example.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {
    private static final double DEFAULT_PRICE = 9.99;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(calculateAsync().get());

        CompletableFuture<String> futureResult = CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply((result) -> {return result + " World";});

        System.out.println(futureResult.get());

        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Request User Profile from external API...");
            return "Some String representation of User Profile";
        }).thenAccept((result) -> {
            System.out.println("User Profile Received: " + result);
        });

        if(future.isDone()) {
            System.out.println("Done");
        }
    }

    public static Future<Double> calculateAsync() throws InterruptedException {
        CompletableFuture<Double> completableFuture = new CompletableFuture<>();

        var es = Executors.newCachedThreadPool();
        Future<Double> future = es.submit(() -> {
            System.out.println("request to a server has been sent...");
            Double result = null;
            TimeUnit.SECONDS.sleep(2);
            return result;
        });

        es.shutdown();
        es.awaitTermination(2, TimeUnit.SECONDS);

        if (future.isDone() && !future.isCancelled()) {
            System.out.println(future.state());
            return future;
        } else {
            completableFuture.complete(DEFAULT_PRICE);
            return completableFuture;
        }
    }
}