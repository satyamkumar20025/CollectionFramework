package ListDemo;


import java.util.*;

public class SecondLargestInList {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(5, 1, 9, 3, 7);
        Set<Integer> sorted = new TreeSet<>(data); // Sorted unique values
        List<Integer> sortedList = new ArrayList<>(sorted);
        System.out.println("Second largest: " + sortedList.get(sortedList.size() - 2));
    }
}