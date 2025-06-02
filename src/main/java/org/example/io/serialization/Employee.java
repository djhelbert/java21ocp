package org.example.io.serialization;

import java.io.*;
import java.util.Map;

public class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private Map<String, String> properties;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> p) {
        this.properties = p;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", props=" + properties + "]";
    }

    /**
     * this method is executed by jvm when writeObject() is called during
     * serialization
     */
    @Serial
    private void writeObject(ObjectOutputStream oos) throws IOException {
        // perform any changes with object before serializing it
        oos.defaultWriteObject();
        System.out.println("=============== serialization in-progress");
    }

    /**
     * this method is executed by jvm when readObject() is called during
     * serialization
     */
    @Serial
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        // perform any changes with object after deserializing it
        System.out.println("=============== de-serialization in-progress");
    }
}
