package org.example.collection;

import java.util.Stack;

/**
 * Stack is a LIFO Data Structure:
 * push() pop() peek()
 */
public class Stacks {
    public static void main(String[] args) {
        Stack<Character> cs = new Stack<>();
        String text = "abcdefghijk";

        for (Character c : text.toCharArray()) {
            cs.push(c);
        }

        cs.addLast(Character.valueOf('l'));

        if (cs.contains(Character.valueOf('f'))) {
            System.out.println("The stack has an f");
        }

        String result = "";
        Character temp = cs.pop();

        while (temp != null) {
            result += temp;
            if (cs.size() > 0 && !cs.isEmpty()) {
                temp = cs.pop();
            } else {
                break;
            }
        }

        System.out.println(result);
        cs.clear();
        System.out.println(cs);
    }
}
