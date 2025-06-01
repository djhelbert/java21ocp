package org.example.concurrent.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinMain {
    public static void main(String[] args) {
        MyRecursiveTask task = new MyRecursiveTask(new int[] {1,2,6,7,8,9,11,12,15,16,18,21,23,27,56,45,12,8,9,0,3,8});
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool(); // or specify the size w/ new ForkJoinPool(2);
        forkJoinPool.execute(task);
        int result = task.join();
        System.out.println(result);
    }
}
