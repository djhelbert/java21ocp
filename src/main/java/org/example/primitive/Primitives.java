package org.example.primitive;

/**
 * Java Numeric Promotion Rules
 *
 * If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
 * If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type.
 * Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator,
 * even if neither of the operands is int.
 * After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands
 */
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

        float fdiv = i/f;
        System.out.println("float div " + fdiv); // defaults to float due to f

        int intdiv = i/8;
        System.out.println("int div " + intdiv); // 4

        System.out.println("increment c to " + (++c)); // d

        double dd = l; // long promoted to double
        System.out.println("long promoted to " + dd); //64.0

        int bmod = 3 % 10;
        System.out.println("Modulus 3 of larger number is " + bmod); // 3
    }
}
