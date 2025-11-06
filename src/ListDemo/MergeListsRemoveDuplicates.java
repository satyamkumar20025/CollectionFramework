package ListDemo;

import java.util.*;

public class MergeListsRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(3, 4, 5);
        Set<Integer> merged = new LinkedHashSet<>();
        merged.addAll(a);
        merged.addAll(b);
        System.out.println("Merged without duplicates: " + merged);
    }
}