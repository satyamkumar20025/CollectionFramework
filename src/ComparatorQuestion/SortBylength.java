package ComparatorQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBylength implements Comparable<SortBylength> {

    String name;

    public SortBylength(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SortBylength [name=" + name + "]";
    }

    @Override
    public int compareTo(SortBylength o) {
        // Compare by length of name
        return this.name.length() - o.name.length();
    }

    public static void main(String[] args) {
        List<SortBylength> names = new ArrayList<>();

        names.add(new SortBylength("c"));
        names.add(new SortBylength("java"));
        names.add(new SortBylength("python"));
        names.add(new SortBylength("html"));
        names.add(new SortBylength("sql"));
        names.add(new SortBylength("angular"));

        System.out.println("Before sorting:");
        for (SortBylength s : names) {
            System.out.println(s.name);
        }

        // Sort using compareTo (natural order)
        Collections.sort(names);

        System.out.println("\nAfter sorting by length:");
        for (SortBylength s : names) {
            System.out.println(s.name);
        }

        // Alternative: sort using lambda comparator
        Collections.sort(names, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nAfter sorting alphabetically:");
        for (SortBylength s : names) {
            System.out.println(s.name);
        }
    }
}