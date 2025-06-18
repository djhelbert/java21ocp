package org.example.oo;

import java.time.LocalDate;

public class Driver extends Person {
    private String license;
    private final LocalDate licenseDate;
    private DriverType driverType;
    private Helmet helmet;

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

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public int getDriverTypeOrdinal() {
        return driverType.ordinal(); // returns ordinal number of the enum
    }

    @Override
    public String toString() {
        return "Driver(" + driverType.name() + " " + getFirst() + " " + getLast() + " since " + licenseDate.toString() + ")";
    }

    protected class Helmet {
        private String size;

        public Helmet(String size) {
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        @Override
        public String toString() {
            return "Helmet Size: " + this.size + " belongs to " + getFirst();
        }
    }

    public static void main(String[] args) {
        Driver d = new Driver("Barny", "Miller", "L14287645", DriverType.BUS);
        Helmet h = d.new Helmet("L"); // Outer instance required
        System.out.println(h);             // To string
        System.out.println(d.getHelmet()); // null
    }
}
