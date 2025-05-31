package org.example.collection;

import java.util.LinkedList;
import java.util.List;

import static org.example.Util.print;

/**
 * List allows duplicate values and is ordered.
 */
public class Lists {
    public static void main(String[] args) {
        List<String> list = List.of("Timmy", "Tom", "Dave", "Steve", "Ron"); // Creates immutable list

        print(list.indexOf("Timmy")); // 0
        print(list.get(1));           // Tom

        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(List.of(1, 3, 6, 8, 9));
        linkedList.add(0, 0);

        print(linkedList);
        print(linkedList.subList(2, 4));
    }
}
