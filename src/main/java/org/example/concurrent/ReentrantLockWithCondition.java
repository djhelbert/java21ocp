package org.example.concurrent;

import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The Condition class provides the ability for a thread to wait for some condition to
 * occur while executing the critical section.
 */
public class ReentrantLockWithCondition {

    final Stack<String> stack = new Stack<>();
    static int CAPACITY = 4;

    ReentrantLock lock = new ReentrantLock();
    Condition emptyCondition = lock.newCondition();
    Condition fullCondition = lock.newCondition();

    public void pushToStack(String item) {
        try {
            lock.lock();
            while (stack.size() == CAPACITY) {
                fullCondition.await();
            }
            stack.push(item);
            emptyCondition.signalAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public String popFromStack() throws InterruptedException {
        try {
            lock.lock();
            while (stack.isEmpty()) {
                emptyCondition.await();
            }
            return stack.pop();
        } finally {
            fullCondition.signalAll();
            lock.unlock();
        }
    }
}