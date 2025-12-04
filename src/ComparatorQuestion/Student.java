package ComparatorQuestion;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<SortByMarks> {
    String name;
    int age;
    int marks;

   
   

    /**
	 * @param name
	 * @param age
	 * @param marks
	 */
	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}



	public int compareTo(Student s) {
        
        return this.marks - marks;
}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}




	public static void main(String[] args) {
		
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Satyam",45, 85));
        students.add(new Student("Ravi",23, 92));
        students.add(new Student("Anjali",16, 78));
        students.add(new Student("Calu",12, 85));
        students.add(new Student("Boom",34, 92));
        students.add(new Student("Ali",12, 85));
        students.add(new Student("shita",13, 95));
        students.add(new Student("kaliya",14, 85));
        students.add(new Student("kalu",15, 92));
        students.add(new Student("motu",16, 85));
        students.add(new Student("bhura",17, 95));


        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks);
        }

        Collections.sort(students, new SortByMarks());

        System.out.println("\nAfter Sorting by Marks:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.marks);
        }
    }



	@Override
	public int compareTo(SortByMarks o) {
		// TODO Auto-generated method stub
		return 0;
	}


	/*
	 * @Override public int compareTo(SortByMarks o) { // TODO Auto-generated method
	 * stub return 0; }
	 */




}

