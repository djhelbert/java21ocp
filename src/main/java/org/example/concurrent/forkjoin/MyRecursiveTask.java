package org.example.concurrent.forkjoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
    private int[] intArray;

    private static final int THRESHOLD = 8;

    public MyRecursiveTask(int[] arr) {
        this.intArray = arr;
    }

    @Override
    protected Integer compute() {
        if (intArray.length > THRESHOLD) {
            return ForkJoinTask.invokeAll(createSubtasks())
                    .stream()
                    .mapToInt(ForkJoinTask::join)
                    .sum();
        } else {
            return processing(intArray);
        }
    }

    private Collection<MyRecursiveTask> createSubtasks() {
        final List<MyRecursiveTask> tasks = new ArrayList<>();
        tasks.add(new MyRecursiveTask(Arrays.copyOfRange(intArray, 0, intArray.length / 2)));
        tasks.add(new MyRecursiveTask(Arrays.copyOfRange(intArray, intArray.length / 2, intArray.length)));
        return tasks;
    }

    private Integer processing(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
