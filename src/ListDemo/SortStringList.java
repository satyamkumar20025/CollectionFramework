package ListDemo;


	import java.util.*;

	public class SortStringList {
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("Satyam", "Aman", "Riya");
	        Collections.sort(names); // Alphabetical sort
	        System.out.println("Sorted list: " + names);
	    }
	}

