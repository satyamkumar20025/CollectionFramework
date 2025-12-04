package ComparableQuestion;

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

    
    public int compareTo(Student s) {
        
            return this.marks - marks;
    }
    
    
    @Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("Calu", 85));
        students.add(new Student("Boom", 92));
        students.add(new Student("Ali", 85));
        students.add(new Student("shita", 95));
        students.add(new Student("kaliya", 85));
        students.add(new Student("kalu", 92));
        students.add(new Student("motu", 85));
        students.add(new Student("bhura", 95));


        Collections.sort(students);

        System.out.println("Sorted Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}