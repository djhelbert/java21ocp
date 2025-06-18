package org.example;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any word: ");
        String word = sc.next();
        System.out.println("You entered this word: " + word);
        System.out.print("Please, enter any integer number: ");
        int i = sc.nextInt();           // Many other types supported like nextBoolean(), nextFloat(), etc.
        System.out.println("You entered this integer number: " + i);
        System.out.println("Skipping next line...");
        String[] values = sc.nextLine().split(" ");

        Pattern p = sc.delimiter(); // What pattern is being used
        System.out.println(p);
        Locale loc = sc.locale();
        System.out.println(loc);

        sc.close(); // Close the scanner
    }
}
