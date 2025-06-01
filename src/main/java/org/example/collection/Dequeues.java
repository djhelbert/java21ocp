package org.example.collection;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Double Ended Queue is a FIFO Data Structure:
 * offer() offerFirst() offerLast() peek() peekFirst() peekLast() poll() pollFirst() pollLast() remove() removeFirst()
 */
public class Dequeues {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedBlockingDeque<>();
        dq.add(3);         // Add to tail
        dq.addFirst(2); // Throws exception if it fails with no return
        dq.addLast(88); // Throws exception if it fails
        dq.offerFirst(1);  // Returns false if it fails true if success
        dq.offerLast(99);  // Returns false if it fails true if success

        dq.remove(); // Removed from head same as poll()

        System.out.println("First" + dq.getFirst()); // Does not remove

        while(dq.peekFirst() != null) {
            System.out.println(dq.pollFirst());     // Returns null if empty 2,3,88, and 99
            // System.out.println(dq.removeFirst());   Throws an exception if empty
        }

        dq.clear();
        System.out.println(dq);
    }
}
