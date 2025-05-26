package org.example.oo;

public enum DriverType {
    TRUCK(true), CAR(false), BUS(true);

    private Boolean largeVehicle;

    private DriverType(Boolean big) {
        this.largeVehicle = big;
    }
}
