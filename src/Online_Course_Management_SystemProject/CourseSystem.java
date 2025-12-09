package Online_Course_Management_SystemProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Vehicle_Rental_System_Project.FileUtils;

public class CourseSystem {

	// [] --> list
	// [obj1->(name, id, contact,password,type,[courselist1]), obj2->(name, id,
	// contact,password,type,[courselist1]),obj3->(name, id,
	// contact,password,type,[courselist1]),]]==> students
	private static List<Student> students = new ArrayList<>();
	// [obj1(id, name ,numner), obj2(id, name ,numner), obj3(id, name ,numner)]
	private static List<Instructor> instructors = new ArrayList<>();
	// [obj1(id, name, price)]
	private static List<Course> courses = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	// persistence files
	private static final File DATA_DIR = new File(System.getProperty("user.dir"), "data");
	private static final File Student_FILE = new File(DATA_DIR, "Student.ser");
	private static final File Course = new File(DATA_DIR, "Course.ser");
	private static final File instructor_FILE = new File(DATA_DIR, "Instructor.ser");

	

	public static void main(String[] args) {
		initializeCourse();
		int choice;
		do {
			System.out.println("\n--- Welcome Online_Course_Management_System ---");
			System.out.println("1. Show Courses");
			System.out.println("2. Student Registration");
			System.out.println("3. Course Purchase");
			System.out.println("4. Display Course Purchases");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 -> showCourse();
			case 2 -> studentRegistration();
			case 3 -> coursePurchase();
			case 4 -> displayCoursePurchase();
			case 5 -> System.out.println("Thank you..");
			default -> System.out.println("Invalid choice.");
			}

		} while (choice != 5);
		
		/// save all data
		///
        saveAllData();
	}

	private static void initializeCourse() {
		Course obj = new LiveCourse("C001", "Java", 5000, "live");
		courses.add(new VideoCourse("C992", "Python", 5000, "video"));
		courses.add(new VideoCourse("C062", "sql", 5000, "video"));
		courses.add(new VideoCourse("C042", "c++", 5000, "video"));
		courses.add(new VideoCourse("C00234", "angular", 5000, "video"));
		
		courses.add(obj);
		saveCourseSafely();

	}

	private static void showCourse() {
		System.out.println("\n📋 Available Courses:");
		for (Course v : courses) {
			System.out.println(v);
		}
	}

	private static void studentRegistration() {
		scanner.nextLine(); // consume newline
		System.out.print("Enter Student ID: ");
		String studentId = scanner.nextLine();
		Student obj = findStudentById(studentId);
		// 1. Check whether student already present in the student list
		if (obj != null) {
			System.out.println("Student already exist!!");
			return;
		}
		System.out.print("Enter Student Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Student Contact: ");
		int contact = scanner.nextInt();
		scanner.nextLine(); // consume newline

		System.out.print("Enter Student Password: ");
		String password = scanner.nextLine();

		System.out.print("Enter The Course Type: ");
		String type = scanner.nextLine();
		Student obj1 = new Student(studentId, name, contact, password, type);
		students.add(obj1);
		saveStudentSafely();
		saveCourseSafely();
		System.out.println(" Student registered successfully!");
	}

	private static void coursePurchase() {
		scanner.nextLine(); // consume newline
		System.out.print("Enter Student ID: ");
		String studentId = scanner.nextLine();
		System.out.print("Enter Course Name: ");
		String courseName = scanner.nextLine();

		// 1. Check whether student present in the purchased list
		Student student = findStudentById(studentId);
		Course obj = findStudentInEnrolledCourses(student, courseName);
		if (obj != null) {
			System.out.println("Already purchased");
			return;
		}
		for (Student s : students) {
			if (s.getStudentId().equalsIgnoreCase(studentId)) {
				student = s;
				break;
			}
		}
		if (student == null) {
			System.out.println(" Student not found.");
			return;
		}

		for (Course v : courses) {
			if (v.getName().equalsIgnoreCase(courseName)) {
				try {
					v.enroll(student);
					saveCourseSafely();
					
					System.out.println(" Course purchased successfully!");
				} catch (EnrollmentException e) {
					System.out.println("EnrollmentException: " + e.getMessage());
				}
				return;
			}
		}

		System.out.println(" Course not found.");
	}

	private static Course findStudentInEnrolledCourses(Student student, String courseName) {
		List<Course> list = new ArrayList<>();
		list = student.getEnrolledCourses();
		for (Course obj : list) {
			if (obj.getName().equals(courseName)) {
				return obj;
			}
		}
		return null;
	}

	private static void displayCoursePurchase() {
		if (students.isEmpty()) {
			System.out.println("No students have purchased courses yet.");
			return;
		}

		for (Student v : students) {
			v.displaySummary();
		}
	}

	private static Instructor findInstructorById(String instructorId) {
		for (Instructor c : instructors) {
			if (c.getInstructorId().equalsIgnoreCase(instructorId)) {
				return c;
			}
		}
		return null;
	}

	private static Course findCourseById(String courseId) {
		for (Course d : courses) {
			if (d.getCourseId().equalsIgnoreCase(courseId)) {
				return d;
			}
		}
		return null;
	}

	private static Student findStudentById(String sid) {

		for (Student s : students) {
			if (s.getStudentId().equalsIgnoreCase(sid)) {
				return s;
			}
		}
		return null;
	}
	// persistence helpers
		private static void saveStudentSafely() {
			try {
				FileUtils.saveList(Student_FILE, students);
			} catch (IOException e) {
				System.err.println("Failed to save Student: " + e.getMessage());
			}
		}

		private static void saveCourseSafely() {
			try {
				// Serialize
				FileUtils.saveList(Course, courses);
			} catch (IOException e) {
				System.err.println("Failed to save : Vehicle " + e.getMessage());
			}
		}

		private static void saveInstructorSafely() {
			try {
				FileUtils.saveList(instructor_FILE, instructors);
			} catch (IOException e) {
				System.err.println("Failed to save Vehicle Booking : " + e.getMessage());
			}
		}

		// deserialization
		
		private static void loadData() {
			try {
				students = FileUtils.loadList(Student_FILE);
			} catch (Exception e) {
				System.out.println("Could not load Student, using defaults: " + e.getMessage());
			}
			try {
				courses = FileUtils.loadList(Course);
			} catch (Exception e) {
				System.out.println("Could not load Course: " + e.getMessage());
			}
			try {
				instructors = FileUtils.loadList(instructor_FILE);
			} catch (Exception e) {
				System.out.println("Could not load Instructors : " + e.getMessage());
			}
		}

		private static void saveAllData() {
			saveStudentSafely();
			saveCourseSafely();
			saveInstructorSafely();
			
			
			
		}
	}