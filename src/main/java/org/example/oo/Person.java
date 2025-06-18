package org.example.oo;

/**
 * Base abstract class
 */
public abstract class Person implements Named {
    private String first;
    private String last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public String getFirst() {
        return first;
    }

    @Override
    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String getLast() {
        return last;
    }

    @Override
    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Person(" + first + " " + last + ")";
    }
}
