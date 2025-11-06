package SetDemo;

import java.util.*;

public class RemoveSetOverlap {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        set1.removeAll(set2); // Remove common elements

        System.out.println("After removing common elements: " + set1);
    }
}
