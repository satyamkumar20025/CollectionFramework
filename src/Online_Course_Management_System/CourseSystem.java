package Online_Course_Management_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import VehicleRentalSystem.Bike;
import VehicleRentalSystem.Car;
import VehicleRentalSystem.Customer;
import VehicleRentalSystem.Truck;
import VehicleRentalSystem.Vehicle;
import VehicleRentalSystem.VehicleNotAvailableException;


public class CourseSystem {

	private static List<Student> students = new ArrayList<>();
	private static List<instructor> instructors = new ArrayList<>();
	private static List<Course>Course = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		initializeCourse();
		int choice;

		do {
			System.out.println("\n--- Welcome Online_Course_Management_System  ---");
			System.out.println("1. showCourse ");
			System.out.println("2. StudentRegistered ");
			System.out.println("3. CoursePurchase");
			System.out.println("4. displayCoursePurchase");
			System.out.println("5.Exit ");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 -> showCourse();
			case 2 -> StudentRegistered();
			case 3 -> CoursePurchase();
			case 4 -> displayCoursePurchase();
			case 5 -> System.out.println("Thank you..");
			default -> System.out.println("Invalid choice.");
			}

		} while (choice != 5);
	}
	private static void initializeCourse() {
		
		Course.add(new LiveCourse("java",5000,"live"));
		Course.add(new LiveCourse("python",5000,"live"));
		Course.add(new LiveCourse("c++",5000,"live"));
		Course.add(new VideoCourse("java",5000,"live"));
		Course.add(new VideoCourse("python",5000,"live"));
		Course.add(new VideoCourse("c++",5000,"live"));
		Course.add(new VideoCourse("c",5000,"live"));
		Course.add(new VideoCourse("html",5000,"live"));
		Course.add(new VideoCourse("css",5000,"live"));

	}

	private static void showCourse() {
		System.out.println("\n📋 Available AllCourse:");
		for (Course v :Course )
			v.displayAllCourse();

	}

	private static void StudentRegistered() {
		// TODO Auto-generated method stub
		scanner.nextLine(); // consume newline
		System.out.print("Enter Student ID: ");
		String StudentId = scanner.nextLine();
	
		System.out.print("Enter Student Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter Student Contact: ");
		int contact = scanner.nextInt();
		
		System.out.print("Enter Student Password: ");
		String PassWord = scanner.nextLine();
		
		System.out.print("Enter The Course Type ");
		String type = scanner.nextLine();
		
		scanner.nextLine();
		
		Student obj = new Student("StudentId","name", contact,"PassWord ", "type");
		Student.add(obj);

	}

	private static void CoursePurchase() {
		         scanner.nextLine(); // consume newline
		         System.out.print("Enter Student ID: ");
		         String StudentId = scanner.nextLine();
		         for(Student  p: students )
		         {  
		        	 if (p.getStudentId().equalsIgnoreCase(StudentId)) {
		        		 
		 
		         		System.out.println("Student is already CoursePurchase ");
		         		return;
		         	}
		         }
		         System.out.print("Enter Enrollment Student name: ");
				 Scanner sc;
				 String id = sc.nextLine();
				 
				 
		         System.out.print("Enter the Enrollment Student type : ");
		         String type = sc.nextLine();
		         

		         for (Course v : Course) {
		             if (v.getType().equalsIgnoreCase(id)) {
		                 try {
		                     v.enroll(Student students));
		                 } catch (EnrollmentException e) {
		                     System.out.println("EnrollmentException " + e.getMessage());
		                 }
		                 return;
		             }
		         }
		         System.out.println("  Enrollment Student not found.");
		     

	}


	private static Object displayCoursePurchase() {
		// TODO Auto-generated method stub
		return null;
	}


	}






