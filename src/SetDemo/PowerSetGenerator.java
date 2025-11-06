package SetDemo;

import java.util.*;

public class PowerSetGenerator {
    public static void main(String[] args) {
        Set<Integer> inputSet = new HashSet<>(Arrays.asList(1, 2));
        List<Set<Integer>> powerSet = new ArrayList<>();
        powerSet.add(new HashSet<>()); // Start with empty set

        for (Integer element : inputSet) {
            List<Set<Integer>> newSubsets = new ArrayList<>();
            for (Set<Integer> subset : powerSet) {
                Set<Integer> newSubset = new HashSet<>(subset);
                newSubset.add(element);
                newSubsets.add(newSubset);
            }
            powerSet.addAll(newSubsets);
        }

        System.out.println("Power set: " + powerSet);
    }
}
