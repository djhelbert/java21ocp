package org.example.annotation;

import java.util.ArrayList;
import java.util.List;

public class AuthorDemo {

    @SuppressWarnings(value = "rawtypes")
    public static void main(String[] args) {
        List list = new ArrayList();
    }

    @Override
    @Author(name = "Bruce Willis")
    @Author(name = "Tom Cruise")
    public String toString() {
        return "Demo[getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() +"]";
    }
}