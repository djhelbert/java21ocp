package org.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(2, 3, 5, 8, 99, 34, 67));

        final Iterator<Integer> iter = ints.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next()); // return the next element
            iter.remove();                   // remove last element from underlying collection
        }

        System.out.println(ints);
    }
}
