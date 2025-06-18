package org.example.record;

import java.util.Objects;

/**
 * Records are IMMUTABLE data classes that require only the type and name of fields.
 * You can implement an interface. You can not use the abstract keyword. They are public by default.
 * @param name Name
 * @param address Address
 */
public final record Person(String name, String address) {
    public static String UNKNOWN_ADDRESS = "Unknown";

    public Person {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

    /**
     * Note: Declaring a compact constructor and one with an argument list matching the generated constructor
     * results in a compilation error.
     *
     * @param name Name
     */
    public Person(String name) {
        this(name, "Unknown");
    }

    @Override
    public String toString() {
        return "u can override methods in a record";
    }

    public boolean isNamed() {
        return name != null;
    }
}
