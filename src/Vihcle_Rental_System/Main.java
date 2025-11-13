package Vihcle_Rental_System;


	 

	 import java.util.ArrayList;
	 import java.util.List;
	 import java.util.Scanner;

	 public class Main {
	 	 String name;
	 	 String  contact;
	 	 int age;
	 	 String type;
	 	 int AadharCard;

	 	private static List<Car> Car = new ArrayList<>();
	     private static List<Bike> Bike = new ArrayList<>();
	     private static List<Truck> Truck = new ArrayList<>();
	     private static Scanner scanner = new Scanner(System.in);
	     public static void main(String[] args) {
	     	 initializeData();
	          int choice;
	          
	          do {
	              System.out.println("\n--- Welcome To Boos Vihcle_Rental_PTD\r\n"+ " ---");
	              System.out.println("1. Register Customer");
	              System.out.println("2. Book Vihcle");
	              System.out.println("3. Display Vihcle");
	              System.out.println("4. Exit");
	              System.out.print("Enter your choice: ");
	              choice = scanner.nextInt();

	              switch (choice) {
	                  case 1 -> bookVihcle();
	                  case 2 -> displayVihcle();
	                  case 3 -> System.out.println("Thank you..");
	                  default -> System.out.println("Invalid choice.");
	              }
	              
	          } while (choice != 3);
	      }

	 	
	 	private static List<Vehicle> vehicle = new ArrayList<>();

	 	private static void initializeData() {
	 	    vehicle.add(new Car("55555545455","bmw",0.24")); 
	 	    vehicle.add(new Bike("bmw",52825825,36)); 
	 	}


     private static void bookVihcle () {
         scanner.nextLine(); // consume newline
         System.out.print("Enter Customer name ");
         String name = scanner.nextLine();
         System.out.print("Enter Customer name ");
         int AadharCard = scanner.nextInt();
         System.out.print("Enter Age: ");
         int age = scanner.nextInt();
         System.out.print("Enter Contact: ");
         String contact = scanner.nextLine();
        
         System.out.print("Enter Type (vihcle): ");
         String type = scanner.nextLine();
         Vehicle obj=new Vehicle(name,AadharCard, age, contact,  type);
         System.out.println("Patient Registered Successfully1!.");
     }
     
    void displayVihcle()
    {
        System.out.print(" Customer name "+name);
        System.out.print(" Customer contact "+contact);
        System.out.print(" Customer age "+age);
        System.out.print(" Customer age "+AadharCard);
        System.out.print(" Customer age "+type);


    	
    }


	public static List<Car> getCar() {
		return Car;
	}


	public static void setCar(List<Car> car) {
		Car = car;
	}


	public static List<Bike> getBike() {
		return Bike;
	}


	public static void setBike(List<Bike> bike) {
		Bike = bike;
	}


	public static List<Truck> getTruck() {
		return Truck;
	}


	public static void setTruck(List<Truck> truck) {
		Truck = truck;
	}
     
    }

	


