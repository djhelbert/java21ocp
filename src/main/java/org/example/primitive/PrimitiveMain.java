package org.example.primitive;

public class PrimitiveMain {
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

        int iff = (int)f;
        System.out.println("int from float " + iff); // .1 is dropped
    }
}
