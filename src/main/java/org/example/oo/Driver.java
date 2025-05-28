package org.example.oo;

import java.time.LocalDate;

public class Driver extends Person {
    private String license;
    private final LocalDate licenseDate;
    private DriverType driverType;

    {
        this.licenseDate = LocalDate.now(); // executed before constructor
    }

    public Driver(String first, String last, String license, DriverType driverType) {
        super(first, last);      // always first
        this.license = license;
        this.driverType = driverType;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public LocalDate getLicenseDate() {
        return licenseDate;
    }

    public DriverType getDriverType() {
        return driverType;
    }

    public void setDriverType(DriverType driverType) {
        this.driverType = driverType;
    }

    public int getDriverTypeOrdinal() {
        return driverType.ordinal(); // returns ordinal number of the enum
    }

    @Override
    public String toString() {
        return driverType.name() + " driver " + getFirst() + " " + getLast() + " since " + licenseDate.toString();
    }
}
