package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMap {
	    public static void main(String[] args) {
	        String sentence = "this is a test this is only a test";
	        Map<String, Integer> wordCount = new HashMap<>();

	        for (String word : sentence.split(" ")) {
	            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	        }

	        System.out.println("Word frequencies:");
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            System.out.println(entry.getKey() + " → " + entry.getValue());
	        }
	    }
	}

