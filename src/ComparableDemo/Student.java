package ComparableDemo;

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

    

    @Override
<<<<<<< HEAD:src/ComparableDemo/Student.java
    public int compareTo(Student s) {
        
            return this.marks - marks;
    }
=======
    public int compareTo(Student p) {
        
            return integer.marks - p.marks;
        }
>>>>>>> f46cf9a9c96ab62984498825da823e65b882d85b:src/Comparable/Student.java

    @Override
    public String toString() {
        return name + " - " + marks;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Calu", 85));
        students.add(new Student("Boom", 92));
        students.add(new Student("Ali", 85));
        students.add(new Student("shita", 95));

        Collections.sort(students);

        System.out.println("Sorted Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}