package org.example.primitive;

import static org.example.Util.*;

/*
 String escape characters:
  \t - tab.
  \b - backspace (a step backward in the text or deletion of a single character).
  \n - new line.
  \r - carriage return.
  \f - form feed.
  \' single quote.
  \" double quote.
  \\ backslash.
 */
public class Strings {
    static {
        System.out.println("Strings static initializer...");
    }

    public static void main(String... args) {
        String s = "first";   // Strings are immutable
        String s1 = "first";  // Literals go to the string pool

        print(s1 == s);      // true
        print(s1.equals(s)); // true

        var s2 = "second"; // cannot assign null to var

        String s3 = new String("first"); // Not part of the string pool
        String s4 = "fi" + "rst";                // Added to string pool as "first"

        print(s1 == s3);      // false
        print(s1 == s4);      // true
        print(s1.equals(s3)); // true

        s3 = s3.intern();     // string from pool is returned

        print(s1 == s3);      // true
        print(s1.equals(s3)); // true

        print("hello world".substring(6)); // world as we start at index 6
        print("hello world".substring(0,5));         // hello as index 5 is not included
        print("hello world".startsWith("hel"));      // true
        print("hello world".indexOf("world"));       // 6

        var text = "hello to a brave new world";
        print(text.split(" ")); // [hello, to, a, brave, new, world]
    }
}
