package org.example.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(List.of(1, 31, 66, 8, 98, 12, 17));
        linkedList.add(0, 0);

        Collections.sort(linkedList);   // Sort collection

        System.out.println(linkedList); // [0, 1, 8, 12, 17, 31, 66, 98]
    }
}
