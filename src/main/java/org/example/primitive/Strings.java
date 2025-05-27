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
        String s = "first";
        String s1 = "first";

        print(s1 == s);      // true
        print(s1.equals(s)); // true

        var s2 = "second"; // cannot assign null to var

        String s3 = new String("first");

        print(s1 == s3);      // false
        print(s1.equals(s3)); // true

        s3 = s3.intern();     // string from pool is returned

        print(s1 == s3);      // true
        print(s1.equals(s3)); // true
    }
}
