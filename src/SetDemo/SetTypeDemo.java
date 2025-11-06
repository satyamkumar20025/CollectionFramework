package SetDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypeDemo {
	    public static void main(String[] args) {
	        Set<Integer> hashSet = new HashSet<>(Arrays.asList(3, 1, 2));
	        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 1, 2));
	        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 1, 2));

	        System.out.println("HashSet (no order): " + hashSet);
	        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
	        System.out.println("TreeSet (sorted order): " + treeSet);
	    }
	}

