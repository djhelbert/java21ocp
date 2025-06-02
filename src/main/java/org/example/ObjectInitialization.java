package org.example;

/**
 * Field and instance initializer are run in order they appear
 * Instance initializers are run before the constructor
 * Constructor follows all static initializers
 * Static block code executes only once during classloading
 */
public class ObjectInitialization {
    public static int num = 1; // First no matter what
    static {
        System.out.println("Static First " + num);
    }
    public String name = "Second";
    { System.out.println(name); name = "Third"; System.out.println(name);}
    private Other other = new Other();

    public ObjectInitialization() {
        System.out.println("Sixth Constructor");  // After object initialization block
        this.name = "sixth";
    }

    public static void main(String[] args) {
        System.out.println("Back to Main");
        ObjectInitialization io = new ObjectInitialization();
        System.out.println("Done");
    }
}

class Other {
    static {
        System.out.println("Other Fourth"); // Not done until class is needed
    }
    { System.out.println("Other Instance Fifth"); }
    public Other() {}
}
