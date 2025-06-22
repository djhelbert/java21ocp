package org.example.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue is a FIFO Data Structure:
 * offer() poll() peek()
 */
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();   // Queue is also a collection
        q.offer(1);
        q.offer(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Integer in = q.remove(); // Removes the head element from the collection (can throw exception)

        if(in != null) {
            System.out.println("Size: " + q.size()); // size 4 after removing 5
        }

        q.poll(); // Removes head of the fifo queue (null if empty)

        while(!q.isEmpty()) {
            Integer i = q.peek();
            System.out.println(i);
            q.poll();
        }

        System.out.println("Queue is now empty");
    }
}
