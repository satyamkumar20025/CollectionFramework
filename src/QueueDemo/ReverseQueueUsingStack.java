package QueueDemo;

import java.util.*;

public class ReverseQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        Stack<Integer> stack = new Stack<>();

        // Transfer from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Transfer back from stack to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println("Queue after reversing: " + queue);
    }
}
