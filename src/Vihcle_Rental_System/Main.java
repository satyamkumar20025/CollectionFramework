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
		 private String name;
		 private String contact;
		 private String age;
		 private String AadharCard;
		 private String type;
	     
	 
	     public static void main(String[] args) {
	 	private static List<Vehicle>Vehicle = new ArrayList<>();
	 	    Vehicle.add(new Car(555555454,"bmw",500,"yes")); 
	 	    Vehicle.add(new Bike(52825825,"bmw",400,"no")); 
	 	    Vehicle.add(new Truck(52825825,"bmw",500, "yes"));
	 	    
	        
	     private static Scanner scanner = new Scanner(System.in);
	          int choice;
	          
	          do {
	              System.out.println("\n--- Welcome To Boos Vihcle_Rental_PTD\r\n"+ " ---");
	              System.out.println("1. NEWCUSTOMER ");
	              System.out.println("2. bookVihcle ");
	              System.out.println("3.displayVihcle ");
	              System.out.println("4. Exit");
	              System.out.print("Enter your choice: ");
	              choice = scanner.nextInt();

	              switch (choice) {
	                  case 1 ->bookVihcle();
	                  case 2 ->bookVihcle();
	                  case 3 ->displayVihcle();
	                  case 4 ->System.out.println("Thank you..");
	                  default ->System.out.println("Invalid choice.");
	              }
	              
	          } while (choice != 3);
	     
	     
	          
	       private static  void bookVihcle () 
	       {
      
             scanner.nextLine(); // consume newline
             System.out.print("Enter Customer id(AadharCard Number) ");
             String AadharCard = scanner.nextLine();
             for(Vihcle_Rental_System.Vehicle p: Vehicle)
             {
             	if(p.getVehicle().equalsIgnoreCase(AadharCard))
             	{
             		System.out.println(" already CUSTOMER");
             		return;
             	}
             }
         System.out.print("Enter Customer name ");
         String name = scanner.nextLine();
         System.out.print("Enter Age: ");
         int age = scanner.nextInt();
         System.out.print("Enter Contact Number1: ");
         String contact = scanner.nextLine();
         System.out.print("Enter Anther Contact Number2: ");
         String contact1 = scanner.nextLine();
         System.out.print("Enter Anther Contact Number3: ");
         String contact2 = scanner.nextLine();
         System.out.print("Enter Type (vihcle): ");
         String type = scanner.nextLine();
     
     
         for(Vehicle a:Vehicle)
         {
        
         	if(v.equals(pid))
         	{
         		System.out.println("Appointment already booked");
         	}
         }
        
         Patient patient = findPatientById(pid);
       
         if (patient == null) {
             System.out.println("Patient not found!!!!.");
             return;
         }
      
         System.out.print("Enter Specialization: ");
         String spec = scanner.nextLine();
         Doctor doctor = findDoctorBySpecialization(spec);
        
         if (doctor == null) {
             System.out.println("No doctor available with that specialization.");
             return;
         }
        
         System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
         String dateStr = scanner.nextLine();
         LocalDate date = LocalDate.parse(dateStr);

         try {
             Appointment appointment = new Appointment(patient, doctor, date);
             appointments.add(appointment);
             System.out.println("Appointment Booked Successfully.");
         } catch (InvalidAppointmentException e) {
             System.out.println("Error:" + e.getMessage());
         }
     }

     private static void displayAppointments() {
         if (appointments.isEmpty()) {
             System.out.println("No appointments found.");
             return;
         }
         for (Appointment a : appointments) {
             a.displaySummary();
         }
     }

     private static Patient findPatientById(String id) {
         for (Patient p : patients) {
             if (p.getPatientId().equals(id)) {
                 return p;
             }
         }
         return null;
     }

     private static Doctor findDoctorBySpecialization(String spec) {
         for (Doctor d : doctors) {
             if (d.getSpecialization().equalsIgnoreCase(spec)) {
                 return d;
             }
         }
         return null;
     }
 
         public double setsalary(double salary) throws VehicleNotAvailableException {
             if (salary < 0) {
                 throw new VehicleNotAvailableException("Vehicle cannot be Available");
             }
             this.salary = salary;
             return this.salary;
         }
	     

        
	     }

         void displayVihcle()
         {
             System.out.print(" Customer name "+name);
             System.out.print(" Customer contact "+contact);
             System.out.print(" Customer age "+age);
             System.out.print(" Customer age "+AadharCard);
             System.out.print(" Customer age "+type);
         }
    	
    
    }
	 
	 
	      
