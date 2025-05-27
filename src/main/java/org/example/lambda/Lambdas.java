package org.example.lambda;

import static org.example.Util.*;

public class Lambdas {
    public static void main(String... args) {
        MyStringFunction upper = (s) -> s.toUpperCase();
        MyStringFunction lower = (String s) -> s.toLowerCase();

        print(upper.apply("upper"));
        print(lower.apply("lower"));
        print(trim((s) -> s.trim(), "  no_spaces   "));
    }

    public static String trim(MyStringFunction func, String s) {
        return func.apply(s);
    }
}
