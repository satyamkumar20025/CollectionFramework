package MapDemo;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());

        System.out.println("Map sorted by values:");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
