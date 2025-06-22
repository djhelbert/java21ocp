package org.example.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

/**
 * Sets do not allow duplicate elements. Does allow a single null value.
 */
public class Sets {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(); // Sorted
        set.add("red");
        set.add("blue");
        set.add("green");
        set.add("white");
        System.out.println(set); // [blue, green, red, white]

        Set<String> hashSet = new HashSet<>();
        hashSet.add("gold");
        hashSet.add("silver");
        hashSet.add("white");  // In both sets
        hashSet.add(null);     // null can be added to a set

        Set<String> unionSet = new HashSet<>(set);
        unionSet.addAll(hashSet);

        System.out.println(unionSet); // [red, gold, null, green, blue, white, silver]

        Set<String> intersects = new LinkedHashSet<>(set); // Predicatable iterator
        intersects.retainAll(hashSet);  // Retains only the elements in this set that are contained in the collection
        System.out.println(intersects); // [white]
    }
}
