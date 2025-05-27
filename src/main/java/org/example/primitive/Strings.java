package org.example.primitive;

import static org.example.Util.*;

public class Strings {
    static {
        System.out.println("Strings static initializer...");
    }

    public static void main(String... args) {
        String s  = "first";
        String s1 = "first";

        print(s1 == s);
        print(s1.equals(s));

        var s2 = "second"; // cannot assign null to var
    }
}
