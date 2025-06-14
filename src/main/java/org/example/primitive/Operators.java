package org.example.primitive;

/**
 * Operator Precedence
 * () (first) ++ -- + - ~ ! (unary) * / % (multiply) + - (additive) << >> >>> & ^ |
 */
public class Operators {
    public static void main(String[] args) {
        int i = 10;
        int x = i++;   // increment after assignment, ++i before assigning to x
        int y = i % 3; // i modulus 3

        System.out.println("x         " + x);
        System.out.println("Remainder " + y); // Y is assigned 2 after i incremented
    }
}
