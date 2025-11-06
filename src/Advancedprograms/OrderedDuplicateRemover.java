package Advancedprograms;


import java.util.*;

public class OrderedDuplicateRemover {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 1, 4);
        Set<Integer> seen = new LinkedHashSet<>(list); // preserves order
        System.out.println("List after removing duplicates (order preserved): " + seen);
    }
}