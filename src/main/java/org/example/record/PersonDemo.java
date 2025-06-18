package org.example.record;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Tim", "12 N 1st Ave");
        Person p2 = new Person("John");
        System.out.println(p1);
        System.out.println(p1.address());
        System.out.println(p2.name());
        System.out.println(p2.isNamed());

        var p3 = new Person("Sandy"); // var only used or local variables only and must be initialized
        System.out.println(p3.toString());
        // var p4 = null; does not compile
    }
}
