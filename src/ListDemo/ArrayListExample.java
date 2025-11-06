package ListDemo;

import java.util.ArrayList;

public class ArrayListExample {
	
	    public static void main(String[] args) {
	        ArrayList<String> names = new ArrayList<>();
	        names.add("Amit");
	        names.add("Neha");
	        names.add("Rahul");

	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	}

