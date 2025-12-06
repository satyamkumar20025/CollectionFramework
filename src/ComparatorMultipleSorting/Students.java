package ComparatorMultipleSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students> {

	// data member
	String name;
	int roll;
	int age;
	Float marks;

	// constructor
	public Students(String name, int roll, int age, float marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
		this.marks = marks;
	}

	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Roll number:" + roll);
	}

	
	public int compareTo(Student s1) {
		return s1.age - this.age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", age=" + age + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentlist = new ArrayList<>();

		Student s1 = new Student("Aj", 101, 23, 566f);
		Student s2 = new Student("Kar", 102, 13, 454.09f);
		Student s3 = new Student("Sataym", 104, 34, 564.34f);
		Student s4 = new Student("A", 104, 23, 454.56f);
		Student s5 = new Student("Gauravbbb", 105, 21, 5634.09f);
		studentlist.add(s5);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s1);
		studentlist.add(s4);

		System.out.println("Before Sorting:");
		studentlist.forEach(System.out::println);

		// Sort by natural order (roll)
		Collections.sort(studentlist);
		System.out.println("\nSorted by Roll (Comparable):");
		studentlist.forEach(s -> System.out.println(s.roll + " " + s.name));

		// Sort by name
		Collections.sort(studentlist, new NameComparator());
		System.out.println("\nSorted by Name (Comparator):");
		studentlist.forEach(s -> System.out.println(s.roll + " " + s.name));
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}