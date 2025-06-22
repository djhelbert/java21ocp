package org.example.flow;

public class Switches {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 7.0);

        switch(n) {
            case 0:
                System.out.println("0"); // continues if there is no break statement
            case 1: case 2:
                System.out.println("1 or 2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Not 1, 2, or 3");
                break;
        }

        final Day day = Day.WEDNESDAY;
        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> {
                yield 7;
            }
            case THURSDAY, SATURDAY     -> {
                yield 8;
            }
            case WEDNESDAY              -> {
                yield 9;
            }
            default -> throw new IllegalStateException("Invalid Day: " + day);
        };
        System.out.println(numLetters);
    }

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, NONE;
    }
}
