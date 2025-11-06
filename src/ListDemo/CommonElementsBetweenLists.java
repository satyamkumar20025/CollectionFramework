package ListDemo;

import java.util.*;

public class CommonElementsBetweenLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        list1.retainAll(list2); // Keep only common elements

        System.out.println("Common elements: " + list1);
    }
}
