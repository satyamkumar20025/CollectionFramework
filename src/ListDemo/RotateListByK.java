package ListDemo;

import java.util.*;

public class RotateListByK {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2; // Rotate by 2 positions

        Collections.rotate(list, k);

        System.out.println("List after rotating by " + k + " positions: " + list);
    }
}