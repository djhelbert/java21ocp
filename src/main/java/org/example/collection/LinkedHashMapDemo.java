package org.example.collection;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap in Java implements the Map interface of the Collections Framework.
 * It stores key-value pairs while maintaining the insertion order of the entries.
 * It maintains the order in which elements are added.
 *
 * Stores unique key-value pairs.
 * Maintains insertion order.
 * Allows one null key and multiple null values.
 * Fast performance for basic operations.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        final LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put(null, 0);
        lhm.put("First", 1);
        lhm.put("Second", 2);
        lhm.put("Third", 3);
        lhm.put("Fourth", 4);
        lhm.put("Fifth", 5);
        lhm.put("Sixth", null);

        lhm.remove("Sixth");

        // Displaying the LinkedHashMap
        System.out.println(lhm.size());
        System.out.println(lhm);
    }
}
