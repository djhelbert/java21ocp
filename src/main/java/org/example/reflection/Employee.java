package org.example.reflection;

import java.time.LocalDate;

public class Employee {
    private int eid;
    private String name;
    LocalDate date;

    Employee() {
    }

    public Employee(int eid, String name) {
        super();
        this.eid = eid;
        this.name = name;
    }

    enum Day {
        SUN, MON, TUE, WED, THU, FRI, SAT;
    }

    @interface MyAnnotation {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid, LocalDate localDate) {
        this.eid = eid;
        this.date = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Computer {
        String model;
        public Computer() {
        }
    }
}