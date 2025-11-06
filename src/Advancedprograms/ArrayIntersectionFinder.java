package Advancedprograms;

import java.util.*;

public class ArrayIntersectionFinder {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> arr2 = Arrays.asList(3, 4, 5, 6);

        arr1.retainAll(arr2); // keep only common elements

        System.out.println("Intersection of arrays: " + arr1);
    }
}
 