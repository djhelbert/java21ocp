package org.example.datetime;

import java.time.*;

public class LocalDateTimes {
    public static void main(String[] args) {
        // LocalDate is an immutable date-time object that represents a date, often viewed as year-month-day.
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        // LocalDateTime is an immutable date-time object, often viewed as year-month-day-hour-minute-second.
        LocalDateTime now    = LocalDateTime.now();
        LocalDateTime now2   = LocalDateTime.of(localDate, localTime);
        LocalDateTime plus12 = now.plusHours(12);

        LocalDate aprilFools = LocalDate.of(2019, Month.APRIL, 1);
        int year = aprilFools.getYear();
        Duration duration = Duration.ofHours(2);
        Duration shorter  = Duration.ofSeconds(32);

        Period howLong = Period.between(aprilFools, LocalDate.now()); // A time-based amount of time like '34.5 seconds'

        // LocalTime is an immutable date-time object that represents a time, often viewed as hour-minute-second.
        LocalTime time = LocalTime.of(17, 30);		      // 5:30 pm with static method
        LocalTime time2 = LocalTime.NOON;

        // A date-based amount of time in the ISO-8601 calendar system, such as '2 years, 3 months and 4 days'.
        Period p = Period.of(1, 0, 0);
        LocalDate aprilFools2 = aprilFools.plus(p);
        LocalDate aprilFools3 = aprilFools.minus(p);

        // A ZoneId is used to identify rules to convert between an Instant and a LocalDateTime.
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId lalaLand = ZoneId.of("America/Los_Angeles");

        // ZonedDateTime is an immutable representation of a date-time with a time-zone.
        ZonedDateTime.of(LocalDateTime.now(), london);
        ZonedDateTime.of(LocalDateTime.now(), lalaLand);

        Instant instant  = Instant.parse("2018-10-20T16:55:30.00Z"); // An instantaneous point on the time-line.
        Instant instant2 = Instant.now();

        // print Instant Value
        System.out.println("Instant: " + instant);

        // create ZoneId object
        ZoneId zone = ZoneId.of("Europe/Paris");

        // A date-time with a time-zone in the ISO-8601 calendar system, such as 2007-12-03T10:15:30+01:00 Europe/Paris.
        ZonedDateTime r = instant.atZone(zone); // Combines this instant with a time-zone to create a ZonedDateTime
                                                // This returns an ZonedDateTime formed from this instant at the specified time-zone.
        System.out.println("ZonedDateTime: " + r);
    }
}
