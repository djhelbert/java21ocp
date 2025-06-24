package org.example.stream;

public class Employee {
    public static String MALE = "MALE";
    public static String FEMALE = "FEMALE";

    String name;
    Integer salary;
    String gender;
    Integer age;

    public Employee(String name, Integer salary, String gender, Integer age) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + gender + " $" + salary + ")";
    }
}
