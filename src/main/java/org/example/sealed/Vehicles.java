package org.example.sealed;

/**
 * A sealed class imposes three important constraints on its permitted subclasses:
 *
 * All permitted subclasses must belong to the same module as the sealed class.
 * Every permitted subclass must explicitly extend the sealed class.
 * Every permitted subclass must define a modifier: final, sealed, or non-sealed.
 *
 */
public class Vehicles {
    abstract static sealed class Vehicle permits Car, Truck {
        private final String registrationNumber;

        public Vehicle(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }
    }

    public static non-sealed class Car extends Vehicle {
        private final int numberOfSeats;

        public Car(int numberOfSeats, String registrationNumber) {
            super(registrationNumber);
            this.numberOfSeats = numberOfSeats;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }
    }

    public static final class Truck extends Vehicle {
        private final int loadCapacity;

        public Truck(int loadCapacity, String registrationNumber) {
            super(registrationNumber);
            this.loadCapacity = loadCapacity;
        }

        public int getLoadCapacity() {
            return loadCapacity;
        }
    }
}
