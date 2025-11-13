package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

   

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Satyam", 85));
        list.add(new Student("Ravi", 92));
        list.add(new Student("Anjali", 78));

        System.out.println("Before Sorting:");
        for (Student s : list) {
            System.out.println(s.name + " - " + s.marks);
        }

        Collections.sort(list, new SortByMarks());

        System.out.println("\nAfter Sorting by Marks:");
        for (Student s : list) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}

