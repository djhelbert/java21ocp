package org.example.oo;

public class Teacher extends Person {
    private String subject;

    public Teacher(String first, String last, String subject) {
        super(first, last);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return getFirst() + " " + getLast() + " subject:" + subject;
    }
}
