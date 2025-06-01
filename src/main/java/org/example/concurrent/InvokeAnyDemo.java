package org.example.concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAnyDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newCachedThreadPool();
        List<Callable<String>> tasks = new ArrayList<>(Arrays.asList(
                () -> {
                    TimeUnit.MILLISECONDS.sleep(500);
                    return "task #1";
                },
                () -> {
                    TimeUnit.MILLISECONDS.sleep(100);
                    return "task #2";
                },
                () -> {
                    TimeUnit.MILLISECONDS.sleep(300);
                    return "task #3";
                }
        ));

        String result = es.invokeAny(tasks);
        System.out.println(result);
    }
}
