package org.example.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("org.example.reflection.Employee");
        Constructor[] constructors = c.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            System.out.println("Constructor Name : " + constructor);
            System.out.println("Constructor Parameters : " + constructor.getParameterCount());

            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Parameter : " + parameter);
            }
            System.out.println();
        }
        System.out.println();

        Method[] methods = c.getDeclaredMethods();
        System.out.println("Length of Method : " + methods.length);

        for (Method method : methods) {
            System.out.println("Method Name: \t" + method);
            System.out.println("Method Return Type: \t" + method.getReturnType());
            System.out.println("Method Parameters: \t" + method.getParameterCount());
            System.out.println();

            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Method Parameter : " + parameter);
            }

            System.out.println();
        }

        System.out.println("Classes->");

        Class[] classes = c.getDeclaredClasses();
        for (Class class1 : classes) {
            System.out.println("Class: " + class1);
            System.out.println("Name of class: " + class1.getName());
        }

        System.out.println("Annotations->");
        Annotation[] anno = c.getDeclaredAnnotations();
        for (Annotation annotation : anno) {
            System.out.println("Annotation: " + annotation);
        }
    }
}