package SetDemo;


import java.util.*;

public class UniqueCharCounter {
    public static void main(String[] args) {
        String input = "hello";
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        System.out.println("Unique characters: " + uniqueChars);
        System.out.println("Count: " + uniqueChars.size());
    }
}
