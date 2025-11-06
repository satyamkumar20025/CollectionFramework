package QueueDemo;

import java.util.*;

public class StackUsingDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Stack after pushing: " + stack);

        // Pop element
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after popping: " + stack);
    }
}
