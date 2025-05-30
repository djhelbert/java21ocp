package org.example.oo;

import java.util.ArrayList;
import java.util.List;

public class OoDemo {
    public static void main(String[] args) {
        Driver  d = new Driver("Billy", "Buck", "", DriverType.TRUCK);
        Driver  c = new Driver("Timmy", "Smith", "", DriverType.BUS);
        Teacher t = new Teacher("Beatrice", "Crabtree","Biology");

        List<Person> people = new ArrayList<>();
        people.add(d);
        people.add(t);
        people.add(c);
        addTeacher(people, new Teacher("Tina", "Jenkins","Math"));

        if(d instanceof Person dvr) {
            System.out.println(dvr.getFirst() + " " + dvr.getLast() + " is a Person");
        }

        System.out.println("---People---");
        printList(people);
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
