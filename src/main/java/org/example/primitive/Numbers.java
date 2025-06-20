package org.example.primitive;

/**
 * How to declare numbers in binary, hexadecimal, and octal.
 */
public class Numbers {
    public static void main(String[] args) {
        int bii = 0b000011;   // 1 * 2^0  + 1 * 2^1  + 0  * 2^2 ...
        int hex = 0x00AFA23;  // 3 * 16^0 + 2 * 16^1 + 10 * 16^2 + ...
        int oct = 0021475;    // 5 * 8^0  + 7 * 8^1  + 4  * 8^2  + 1 * 8^3 + ...

        System.out.println("Binary    " + bii);
        System.out.println("Hex       " + hex);
        System.out.println("Octal     " + oct);

        int bshift = bii << 1;                     // shift left doubles the value
        System.out.println("Shifted   " + bshift); // 2^0 * 0 + 2^1 * 1 + 2^2 * 1    eg. 0b000110
        bshift >>= 2;
        System.out.println("Shifted   " + bshift); // 2^0 * 1 + 2^1 * 0 + 2^2 * 0    eg. 0b000001
        System.out.println("|         " + (0b0000001 | 0b0000011)); // or results in 3 and would be 1
        System.out.println("Flip bits 1 is " + (~1));

        int neg = -64;
        System.out.println("-64 >>  "  + (neg >> 1));  // remains negative
        System.out.println("-64 >>> "  + (neg >>> 1)); // unsigned shift becomes large positive number
        System.out.println("-88 >>> "  + (neg >>> -88)); // unsigned shift becomes large positive number

        String oString = Integer.toOctalString(12);
    }
}
