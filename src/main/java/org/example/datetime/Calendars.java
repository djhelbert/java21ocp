package org.example.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.example.Util.print;

public class Calendars {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // Mutable
        int year  = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int monthDay = cal.get(Calendar.DAY_OF_MONTH);  // DAY_OF_WEEK, DAY_OF_YEAR, WEEK_OF_YEAR
        print(year);
        print(month);
        print(monthDay);
        int sec  = cal.get(Calendar.SECOND);
        int min  = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        print(hour);
        print(min);
        print(sec);
        System.out.println(cal.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd hh:mm:ss");
        print(sdf.format(cal.getTime()));
        cal.set(2000, Calendar.JANUARY,1); // Happy new year
        cal.add(Calendar.YEAR, 20);
        print(sdf.format(cal.getTime())); // Add 20 years
    }
}
