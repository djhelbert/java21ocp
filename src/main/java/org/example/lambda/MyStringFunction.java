package org.example.lambda;

/**
 * A functional interface has only 1 abstract method.
 */
@FunctionalInterface
public interface MyStringFunction {
    String SPACE = " ";     // public and static by default

    String apply(String s); // public by default

    static double getPI() {
        return Math.PI;
    }

    private double getE() {
        return Math.E;
    }

    default String addSpace(String s) {
        return s + SPACE;
    }
}
