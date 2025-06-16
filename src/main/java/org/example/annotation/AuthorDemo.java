package org.example.annotation;

import java.util.ArrayList;
import java.util.List;

public class AuthorDemo {

    @Valued("override the default")
    public AuthorDemo() {
    }

    @SuppressWarnings(value = "rawtypes")
    public static void main(String[] args) {
        List list = new ArrayList();
    }

    @Override
    @Author(name = "Bruce Williams", books = 2)
    @Author(name = "Tom Jenkins")
    public String toString() {
        return "Demo[getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() +"]";
    }
}