package org.example;

public class EnumDemo {
    public static void main(String... args) {
        DayEnum day = DayEnum.FRIDAY;

        System.out.println(day.description());

        if(day.weekend) {
            System.out.println("It is a weekend day");
        } else {
            System.out.println("Bummer");       // This is printed
        }

        int ord = day.ordinal();
        System.out.println("Ordinal:" + ord);   // 5

        day = DayEnum.valueOf("MONDAY");  // MONDAY
        System.out.println("Day:" + day.name());
        System.out.println("Ordinal:" + day.ordinal()); // 1

        String dayString = day.toString();
        System.out.println(dayString);
    }
}
