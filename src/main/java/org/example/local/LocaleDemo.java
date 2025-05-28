package org.example.local;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale l1 = new Locale("hi", "IN");
        Locale l2 = new Locale("en", "IN");
        Locale l3 = Locale.GERMAN;
        Locale l4 = new Locale("fr", "CA");
        Locale l5 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l6 = Locale.forLanguageTag("en-US");

        printAllAvailableLocales();

        Locale default1Locale = Locale.getDefault();
        System.out.println("Default Locale:" + default1Locale);
        Locale.setDefault(Locale.US);

    }

    private static void printAllAvailableLocales() {
        System.out.println("===== ALL AVAILABLE LOCALES =====");
        for (Locale locale : Locale.getAvailableLocales()) {
            System.out.println(locale);
        }
    }
}