package org.example.primitive;

public class AutoBox {

    public static void main(String[] args) {
        int i = 1;
        Integer in1 = 2;
        Integer in2 = Integer.parseInt("3");
        int j = in1;
        Character ch = '0';

        printInteger(Short.parseShort("0")); // can be converted to float
        printInteger(ch);
        printInteger('a');  // can be converted to float
        printInteger(i);       // can be converted to float
        printInteger(in1);
        printInteger(4F);
        printInteger(Float.valueOf(5F));
        // printInteger(6.66); does not compile with a double
    }

    public static void printInteger(Integer i) {
        System.out.println("Integer " + i);
    }

    public static void printInteger(float i) {
        System.out.println("float " + i);
    }

    public static void printInteger(Float i) {
        System.out.println("Float " + i);
    }

    public static void printInteger(String s) {
        System.out.println("string " + s);
    }
}
