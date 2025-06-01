package org.example.record;

import java.util.Objects;

/**
 * Records are immutable data classes that require only the type and name of fields.
 *
 * @param name
 * @param address
 */
public record Person(String name, String address) {
    public static String UNKNOWN_ADDRESS = "Unknown";

    public Person {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

    /**
     * Note: Declaring a compact constructor and one with an argument list matching the generated constructor
     * results in a compilation error.
     *
     * @param name
     */
    public Person(String name) {
        this(name, "Unknown");
    }
}
