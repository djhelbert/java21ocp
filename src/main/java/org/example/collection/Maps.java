package org.example.collection;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        System.out.println("One  : " + map.get("One"));
        System.out.println("Two  : " + map.get("Two"));
        System.out.println("Five : " + map.get("Five"));

        Comparator<Name> comp = (a,b) -> a.last.compareTo(b.last); // Sort by last name

        Map<Name, String> treeMap = new TreeMap<>(comp);
        treeMap.put(new Name("DJ", "Smith"), "1");
        treeMap.put(new Name("Rich", "Thompson"), "2");
        treeMap.put(new Name("BJ", "Daily"), "3");
        treeMap.putIfAbsent(new Name("Tina", "Bart"), "4");

        for(Name n : treeMap.keySet()) {
            System.out.println(n.toString() + " " + treeMap.get(n)); // Prints in key sorted order
        }

        System.out.println("All Values...");
        for(String v : treeMap.values()) {
            System.out.println(v); // Print map values
        }

        List<Name> names = new ArrayList<>(treeMap.keySet());

        names.sort(new Comparator<Name>() {
            @Override
            public int compare(Name n1, Name n2) {
                return n1.first.compareTo(n2.first);
            }
        });

        System.out.println(names);
    }
}

class Name {
    String first;
    String last;
    public Name(String f, String l) {
        first = f;
        last = l;
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Name)) {
            return false;
        }
        return ((Name)o).first.equals(first) && ((Name)o).last.equals(last) ;
    }

    @Override
    public int hashCode() {
        return first.hashCode() + last.hashCode();
    }

    @Override
    public String toString() {
        return first + "," + last;
    }
}

class License implements Comparable<License> {
    String license;

    @Override
    public int compareTo(License other) {
        return license.compareTo(other.license);
    }
}