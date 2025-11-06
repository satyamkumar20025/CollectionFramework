package ListDemo;

import java.util.*;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30));

        // Remove even numbers using lambda
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("List after removing even numbers: " + numbers);
    }
}