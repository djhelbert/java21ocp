package org.example;

/**
 * Valid Variable Names
 *    Do not start with a number! It will not compile.
 *    _ $ a-Z 0-9 are valid characters
 */
public class Main {
    int _22 = 22; // valid
    int $$$ = 3;  // valid

    /**
     * Vararg must be last argument.
     *
     * @param args Variable Argument Example
     */
    public static void main(String... args) {
        System.out.print("Greetings! ");           // No end of line
        System.out.println("Hello and welcome!"); // End of line added

        if(args.length > 0 ) {
            System.out.println("First argument:" + args[0]);  // Treat as an array
        }

        System.out.printf("Hello %s Formatted!", "World"); // No end of line added
        System.out.printf(" End of method %d.", 1);        // Formatted with a number
    }
}

/**
 * There can only be one public class per file. Default class only visible within package.
 */
class _$OtherMain66 {
}