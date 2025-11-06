package MapDemo;

import java.util.*;

public class MergeMapsWithSum {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = Map.of(1, 10, 2, 20);
        Map<Integer, Integer> map2 = Map.of(2, 30, 3, 40);

        Map<Integer, Integer> merged = new HashMap<>(map1);
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            merged.put(entry.getKey(), merged.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        System.out.println("Merged map with summed values: " + merged);
    }
}
