package org.example.generic;

import static org.example.Util.print;

public class NumberDecorator<T extends Number & Comparable<T>> {
    private T number;

    public NumberDecorator(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public String getString() {
        return number.toString();
    }

    public double floor() {
        return Math.floor(number.doubleValue());
    }

    public double abs() {
        return Math.abs(number.doubleValue());
    }

    public static void main(String[] args) {
        final NumberDecorator<Float> d1 = new NumberDecorator<>(-12.333F);

        print(d1.getNumber());
        print(d1.abs());
        print(d1.floor());

        final NumberDecorator<Integer> d2 = new NumberDecorator<>(12);

        print(d2.getNumber());
        print(d2.abs());
        print(d2.floor());
    }
}
