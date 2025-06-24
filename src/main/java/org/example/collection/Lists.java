package org.example.collection;

import java.util.ArrayList;
import java.util.Collections;
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
        // list.remove("Ron");        // We hate Ron
        // list.removeIf(s -> s.equals("Ron"));
        // list.reversed();
        // list.set(0, "Tim");        // Replace Timmy with Tim
        // list.clear();
        print("Size:" + list.size());
        print(list);

        List<Integer> linkedList = new LinkedList<>(List.of(1, 3, 6, 8, 9));
        linkedList.addFirst(0);

        print(linkedList);
        print(linkedList.subList(2, 4));

        List<Number> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(1.4);
        numbers.add(Short.valueOf("3"));

        for(Number n : numbers) {
            if(n instanceof Integer i) {
                System.out.println(i);
            } else if(n instanceof Short s) {
                System.out.println(s);
            }
        }

        List<Integer> ints = new ArrayList<>(List.of(6, 1, 2, 3));
        System.out.println(ints.size());
        Collections.addAll(ints, 7, 4, 5);
        print(ints);
        Collections.sort(ints);
        print(ints);
        if(ints.contains(2)) {
            System.out.println("Found # 2");
        }

        ints.clear();
    }
}
