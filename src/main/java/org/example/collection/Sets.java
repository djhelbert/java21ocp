package org.example.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

/**
 * Sets do not allow duplicate elements. Does allow a single null value.
 */
public class Sets {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("red");
        set.add("blue");
        set.add("green");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("gold");
        hashSet.add("silver");
        hashSet.add(null);

        Set<String> combined = new HashSet<>(set);
        combined.addAll(hashSet);

        System.out.println(combined);
    }
}
