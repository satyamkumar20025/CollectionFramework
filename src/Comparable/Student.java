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
    public int compareTo(Student p) {
        
            return integer.marks - p.marks;
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