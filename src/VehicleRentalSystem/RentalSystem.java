package VehicleRentalSystem;

	 import java.time.LocalDate;
import java.util.ArrayList;
	 import java.util.List;
	 import java.util.Scanner;


		 public class RentalSystem{
		     private static List<Vehicle> vehicles = new ArrayList<>();
		     private static List<Customer> customers = new ArrayList<>();
		     private static List<VehicleBooking> vehicleBookings = new ArrayList<>();
		     private static Scanner scanner = new Scanner(System.in);

		     public static void main(String[] args) {
		    	 initializeVehicle();
		         int choice;
		         
		         do {
		             System.out.println("\n--- Welcome To BOOS VehicleRental  ---");
		             System.out.println("1. showVehicles ");
		             System.out.println("2. VehicleBooking ");
		             System.out.println("3. displayVehicleBooking");
		             System.out.println("4. Exit");
		             System.out.print("Enter your choice: ");
		             choice = scanner.nextInt();

		             switch (choice) {
		                 case 1 -> showVehicles();
		                 case 2 -> VehicleBooking();
		                 case 3 -> VehicleBooking();
		                 case 4 -> displayVehicleBooking();
		                 case 5 -> System.out.println("Thank you..");
		                 default -> System.out.println("Invalid choice.");
		             }
		             
		         } while (choice != 5);
		     }

		     private static void initializeVehicle() {
		    	  vehicles.add(new Car("0101", "BMW", 1000));
		          vehicles.add(new Bike("0801", "BMW", 500));
		          vehicles.add(new Truck("009901", "BMW Ace", 1500));
		      }
		     private static void showVehicles() {
		         System.out.println("\n📋 Available Vehicles:");
		         for (Vehicle v : vehicles) v.displayInfo();
		     }


		     private static void VehicleBooking() {
		         scanner.nextLine(); // consume newline
		         System.out.print("Enter Customer ID: ");
		         String id = scanner.nextLine();
		         for(Customer  p: customer )
		         {
		        	 if (p.getCustomerId().equalsIgnoreCase(id)) {
		        		 
		 
		         		System.out.println("Customer already rent Vehicle");
		         		return;
		         	}
		         }
		         System.out.print("Enter Name: ");
		         String name = scanner.nextLine();
		         System.out.print("Enter Age: ");
		         int age = scanner.nextInt();
		         scanner.nextLine();
		         System.out.print("Enter Contact: ");
		         String contact = scanner.nextLine();
		        
		         System.out.print("Enter Type (General/Surgery): ");
		         String type = scanner.nextLine();
		         System.out.print("Enter Vehicle ID to rent: ");
		         String id = sc.nextLine();
		         System.out.print("Enter number of days: ");
		         int days = sc.nextInt();
		         sc.nextLine();

		         for (Vehicle v : vehicles) {
		             if (v.getVehicleId().equalsIgnoreCase(id)) {
		                 try {
		                     v.rent(days);
		                 } catch (VehicleNotAvailableException e) {
		                     System.out.println("NotAvailable " + e.getMessage());
		                 }
		                 return;
		             }
		         }
		         System.out.println(" Vehicle not found.");
		     

		         System.out.println("Customer rent Vehicle Registered Successfully1!.");
		     }

		     private static void displayVehicleBooking() {
		         if (VehicleBooking.isEmpty()) {
		             System.out.println("No VehicleBooking found.");
		             return;
		         }
		         for (VehicleBooking a : VehicleBooking) {
		             a.displaySummary();
		         }
		     }

		     private static VehicleBooking findVehicleBookingById(String id) {
		         for (VehicleBooking p : VehicleBookings) {
		             if (p.getBookingid().equals(id)) {
		                 return p;
		             }
		         }
		         return null;
		     }

		     private static Customer findCustonerById(String spec) {
		         for (Customer d : Customer) {
		             if (d.getCustomer().equalsIgnoreCase(spec)) {
		                 return d;
		             }
		         }
		         return null;
		     }
		 }
