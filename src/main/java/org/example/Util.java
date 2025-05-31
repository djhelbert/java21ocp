package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Utility class that has been marked final.
 */
public final class Util {
    /**
     * Private Constructor
     */
    private Util() {}

    public static void print() {
        System.out.println();
    }

    public static void print(boolean b) {
        System.out.println(b);
    }

    public static void print(double d) {
        System.out.println(d);
    }

    public static void print(long i) {
        System.out.println(i);
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(String[] strings) {
        System.out.println(Arrays.toString(strings));
    }

    public static void print(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void print(Set<String> strings) {
        System.out.println(strings);
    }

    public static void print(List<String> strings) {
        System.out.println(strings);
    }

    public static void print(Map<?,?> map) {
        System.out.println(map);
    }
}
