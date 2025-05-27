package org.example.generic;

public class NumberDecorator<T extends Number> {
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
}
