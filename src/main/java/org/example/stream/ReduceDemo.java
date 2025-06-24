package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static org.example.Util.print;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,7);
        int total = numbers.stream().mapToInt(n -> n).reduce(0, Integer::sum);
        print(total);

        OptionalInt small = numbers.stream().mapToInt(n -> n).reduce(Math::min);
        print(small.getAsInt());

        List<Integer> odds = numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList()); // toSet()
        print(odds);

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Samantha", 23, Employee.FEMALE, 23));
        list.add(new Employee("Tim", 46, Employee.MALE, 43));
        list.add(new Employee("Steve", 72, Employee.MALE, 34));
        list.add(new Employee("Megan", 24, Employee.FEMALE, 24));
        list.add(new Employee("Fred", 99, Employee.MALE, 51));

        print(list.stream().collect(Collectors.groupingBy(Employee::getGender)));
        print(list.stream().collect(Collectors.partitioningBy(e -> e.getGender().equals(Employee.FEMALE))));
        print(list.parallelStream().collect(Collectors.groupingByConcurrent(Employee::getGender)));
    }
}
