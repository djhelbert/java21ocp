package org.example.primitive;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Start");
        sb.append(' ');
        sb.insert(sb.indexOf(" "), " Middle");
        sb.append("End");

        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.substring(0, 5));
    }
}
