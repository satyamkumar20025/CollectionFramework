package MapDemo;

import java.util.*;

public class MaxValueKeysFinder {
    public static void main(String[] args) {
        Map<Integer, Integer> map = Map.of(1, 10, 2, 20, 3, 20);
        int max = Collections.max(map.values());

        System.out.println("Keys with max value:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
