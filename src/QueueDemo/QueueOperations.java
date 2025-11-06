package QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
	    public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();

	        // Enqueue operations
	        queue.add(10);
	        queue.add(20);
	        queue.add(30);

	        System.out.println("Queue after enqueuing: " + queue);

	        // Dequeue operation
	        int removed = queue.poll(); // removes head
	        System.out.println("Dequeued element: " + removed);
	        System.out.println("Queue after dequeuing: " + queue);
	    }
	}

