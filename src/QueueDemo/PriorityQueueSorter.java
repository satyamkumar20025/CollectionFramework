package QueueDemo;

import java.util.*;

public class PriorityQueueSorter {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue (sorted as inserted):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}