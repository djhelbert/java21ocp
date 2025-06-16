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

    public void doBox() {
        //Double dv = 23; Does not compile
        Double dv = 3.1;
        Integer i = 12;
        int ii = i;
        double dbl = i;
        float flt = dv.floatValue();
        Character c = 'c';
    }

    public void doEquals() {
        Integer i1 = 12;
        int i2 = 12;
        System.out.println(i1 == i2);      // true
        System.out.println(i1.equals(i2)); // true
    }
}
