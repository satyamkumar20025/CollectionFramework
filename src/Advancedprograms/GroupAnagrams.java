package Advancedprograms;


import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bat", "tab", "cat", "act", "tac");

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        System.out.println("Grouped anagrams: " + anagramGroups);
    }
}