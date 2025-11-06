package ListDemo;

import java.util.*;

public class CheckPalindromeList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);

        // Reverse copy of the list
        List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);

        // Compare original and reversed
        if (list.equals(reversed)) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is not a palindrome.");
        }
    }
}
