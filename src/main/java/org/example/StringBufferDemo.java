package org.example;

/**
 * The key features of StringBuffer class:
 * You can modify the content of the StringBuffer without creating a new object.
 * StringBuffer has an initial capacity, and it can also be adjusted later with the help of the ensureCapacity() method.
 * With the append() method, we can add characters, strings, or objects at the end of the StringBuffer.
 * With the insert() method, we can insert characters, strings, or objects at a specified position in the StringBuffer.
 * With the delete() method, we can remove characters from the StringBuffer.
 * With the reverse() method, we can reverse the order of characters in the StringBuffer.
 */
public class StringBufferDemo {
    public static void main(String[] args){

        // Creating StringBuffer
        StringBuffer s = new StringBuffer();

        // Adding elements in StringBuffer
        s.append("Hello");
        s.append(" ");
        s.append("World!");

        s.delete(s.length()-1, s.length()); // Remove !

        // String with the StringBuffer value
        String str = s.toString();
        System.out.println(str);

        s.reverse();
        System.out.println(s.toString());
    }
}