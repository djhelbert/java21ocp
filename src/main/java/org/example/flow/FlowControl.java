package org.example.flow;

public class FlowControl {
    public static void main(String[] args) {
        int x = 12;

        if (x < 12) {
            System.out.println("Less Than 12");
        } else if (x == 12) {
            System.out.println("12");
        } else {
            System.out.println("Greater Than 12");
        }

        do {
            ++x;
            System.out.println("x is " + x);
        } while (x < 21);

        while (x < 30) {
            x++;

            if (x == 26 || x == 27) {
                continue;
            }

            System.out.println("x is " + x);
            if (x > 28) {
                break;
            }
        }

        loop1:
        for (int i = 0; i < 5; i++) {
            System.out.println("counter i: " + i);

            loop2:
            for (int j = 0; j < 5; j++) {
                System.out.println("counter j: " + j);
                if (j >= 0 && j < 3) {
                    System.out.println("continue loop2");
                    continue loop2;
                } else {
                    System.out.println("break loop1");
                    break loop1;
                }
            }
        }
    }
}
