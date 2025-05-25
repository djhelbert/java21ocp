package org.example;

public class Main {
    /**
     * Vararg must be last argument.
     *
     * @param args Variable Argument Example
     */
    public static void main(String... args) {
        System.out.println("Hello and welcome!");
        if(args.length > 0 ) {
            System.out.println("First argument:" + args[0]);  // Treat as an array
        }
    }
}