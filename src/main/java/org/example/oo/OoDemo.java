package org.example.oo;

import java.util.ArrayList;
import java.util.List;

public class OoDemo {
    public static void main(String[] args) {
        Driver  d = new Driver("Billy", "Buck", "", DriverType.TRUCK);
        Driver  c = new Driver("Timmy", "Smith", "", DriverType.BUS);
        Teacher t = new Teacher("Beatrice", "Crabtree","Biology");

        System.out.println((Person)t); // Still uses toString() of teacher class

        List<Person> people = new ArrayList<>();
        people.add(d);
        people.add(t);
        people.add(c);
        addTeacher(people, new Teacher("Tina", "Jenkins","Math"));

        if(d instanceof Person drvr) {
            System.out.println(drvr + " is a Person");
        }

        System.out.println("---People---");
        printList(people);

        System.out.println(Teacher.Classroom.DIV); // Static variable can be used
    }

    private static void printList(List<? extends Person> list) {
        for(Person p : list) {
            System.out.println(p.getFirst() + " " + p.getLast());
        }
    }

    private static void addTeacher(List<? super Person> list, Teacher p) {
        list.add(p);
    }
}
