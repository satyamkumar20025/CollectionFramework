package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student() {
        super();
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student other) {
        // Descending by marks
        if (this.marks != other.marks) {
            return other.marks - this.marks;
        }
        // Ascending by name
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Alice", 85));
        students.add(new Student("Akshit", 95));

        Collections.sort(students);

        System.out.println("Sorted Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}