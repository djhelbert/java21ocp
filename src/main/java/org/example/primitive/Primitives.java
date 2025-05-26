package org.example.primitive;

public class Primitives {
    public static void main(String[] args) {
        boolean fun = false;   // default value is false
        byte b = 8;            // default value is 0
        int i = 32;            // default integer type
        long l = 64L;          // L or l required
        double d = 32.1;       // default float type
        float f = 32.1F;       // F or f required
        char c = 'c';
        char def_c;
        short s = 16;

        long lfi = i;
        System.out.println("long from int " + lfi);
        double dff = f;
        System.out.println("double from float " + dff);

        int formattedInt = 1_000_000; // _ cannot lead or be next to .
        System.out.println("formatted int " + formattedInt);

        float ffd = (float)d;
        System.out.println("float from double " + ffd);

        byte bc = (byte)c;
        System.out.println("byte from char " + bc);

        bc = (byte)100_000_000;
        System.out.println("new byte value " + bc);

        int iff = (int)f;
        System.out.println("int from float " + iff); // .1 is dropped

        int bsum = b * 2;
        System.out.println("byte multiply " + bsum); // defaults to int with short or bytes

        double fdiv = i/f;
        System.out.println("float div " + fdiv); // defaults to double

        int intdiv = i/8;
        System.out.println("int div " + intdiv);

        System.out.println("increment c to " + (++c));
    }
}
