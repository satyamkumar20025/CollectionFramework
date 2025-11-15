package Vihcle_Rental_System;

	 import java.time.LocalDate;
import java.util.ArrayList;
	 import java.util.List;
	 import java.util.Scanner;

import Hospital_System.Appointment;
import Hospital_System.Doctor;
import Hospital_System.InvalidAppointmentException;
import Hospital_System.Patient;

	 public class Main {
		 
	 
	     public static void main(String[] args) {
	 	List<Vehicle>Vehicle = new ArrayList<>();
	 	    Vehicle.add(new Car(555555454,"bmw",500,"yes")); 
	 	    Vehicle.add(new Bike(52825825,"bmw",400,"no")); 
	 	    Vehicle.add(new Truck(52825825,"bmw",500, "yes"));
	 	    
	        
	     Scanner scanner = new Scanner(System.in);
	          int choice;
	          
	          do {
	              System.out.println("\n--- Welcome To Boos Vihcle_Rental_PTD\r\n"+ " ---");
	              System.out.println("1. bookVihcle ");
	              System.out.println("2. Exit");
	              System.out.print("Enter your choice: ");
	              choice = scanner.nextInt();

	              switch (choice) {
	                  case 1 ->bookVihcle();
	                  case 2 ->System.out.println("Thank you..");
	                  default ->System.out.println("Invalid choice.");
	              }
	              
	          } while (choice != 2);
	     
	     
	          
	     }
	     public void bookVihcle() {
	    	    Scanner sc = new Scanner(System.in);

	    	    System.out.print("Enter Customer ID: ");
	    	    String cid = sc.next();

	    	    System.out.print("Enter Customer Name: ");
	    	    String cname = sc.next();

	    	    System.out.print("Enter Customer Phone: ");
	    	    String phone = sc.next();


	    	    System.out.print("Enter Vehicle ID to Rent: ");
	    	    String vid = sc.next();

	    	    Vehicle[] vehicles;
				for (Vehicle v : vehicles) {
	    	        if (v.getVehicle().equalsIgnoreCase(vid)) {
	    	    
	    	       
	    	    System.out.println("\n--- Booking Successful ---");
	    
	    	}
				}
	     }
	 }