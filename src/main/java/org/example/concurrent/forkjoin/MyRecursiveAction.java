package org.example.concurrent.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.logging.Logger;

/**
 * The forking behavior of the framework, the example splits the task if workload.length() is larger than a specified
 * threshold using the createSubtask() method.
 */
public class MyRecursiveAction extends RecursiveAction {

    private final String workload;
    private static final int THRESHOLD = 4;

    private static final Logger logger = Logger.getAnonymousLogger(); // Get anonymous logger

    public MyRecursiveAction(String workload) {
        this.workload = workload;
    }

    @Override
    protected void compute() {
        if (workload.length() > THRESHOLD) {
            ForkJoinTask.invokeAll(createSubtasks());
        } else {
            processing(workload);
        }
    }

    private List<MyRecursiveAction> createSubtasks() {
        final List<MyRecursiveAction> subtasks = new ArrayList<>();

        var p1 = workload.substring(0, workload.length() / 2);
        var p2 = workload.substring(workload.length() / 2);

        subtasks.add(new MyRecursiveAction(p1));
        subtasks.add(new MyRecursiveAction(p2));

        return subtasks;
    }

    private void processing(String work) {
        String result = work.toUpperCase();
        logger.info("This result - (" + result + ") - was processed by " + Thread.currentThread().getName());
    }
}
