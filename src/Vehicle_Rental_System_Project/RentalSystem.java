package Vehicle_Rental_System_Project;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalSystem {
	private static List<Vehicle> vehicles = new ArrayList<>();
	private static List<Customer> customers = new ArrayList<>();
	private static List<VehicleBooking> vehicleBookings = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	// persistence files
	private static final File DATA_DIR = new File(System.getProperty("user.dir"), "data");
	private static final File Customer_FILE = new File(DATA_DIR, "Customer.ser");
	private static final File Vehicke_FILE = new File(DATA_DIR, "Vehicke.ser");
	private static final File VehicleBooking_FILE = new File(DATA_DIR, "VehileBooking.ser");

	public static void main(String[] args) {
		initializeVehicle();
		loadData();
		int choice;

		do {
			System.out.println("\n--- Welcome To BOOS VehicleRental  ---");
			System.out.println("1. Show Vehicles ");
			System.out.println("2. Customer Registeration ");
			System.out.println("3. Vehicle Booking");
			System.out.println("4. Display All Booking");
			System.out.println("5.Cancel Vehicle Booking ");
			System.out.println("6.Update ");
			System.out.println("7.Exits");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 -> showVehicles();
			case 2 -> CustomerRegisteration();
			case 3 -> booking();
			case 4 -> displayVehicleBooking();
			case 5 -> cancelVehicleBooking();
			case 6 -> updateCustomer();
			case 7 -> System.out.println("Thank you..");
			default -> System.out.println("Invalid choice.");
			}

		} while (choice != 7);

		// save data before exit
		saveAllData();
	}

	private static void initializeVehicle() {
		vehicles.add(new Car("0101", "BMW", 1000));
		vehicles.add(new Car("0111", "tata", 1000));
		vehicles.add(new Car("0121", "BMW", 1000));
		vehicles.add(new Bike("001", "mg", 500));
		vehicles.add(new Bike("0301", "BMW", 500));
		vehicles.add(new Bike("0701", "king", 500));
		vehicles.add(new Truck("p09901", "BMW Ace", 1500));
		vehicles.add(new Truck("w09901", "mahinadhat", 1500));
		vehicles.add(new Truck("t09901", "BMW Ace", 1500));
		vehicles.add(new Truck("rrr09901", "gold", 1500));
		saveVehiclelSafely();

	}

	private static void cancelVehicleBooking() {
		scanner.nextLine();
		System.out.println("Enter the Vehicle Booking  Id to cancel:");
		String apid = scanner.nextLine();
		VehicleBooking obj = fingvehicleBookingsById(apid);
		if (obj == null) {
			System.out.println("No Customer found with id: " + apid);
			return;
		}
		Customer.remove(obj);
		System.out.println("Appointment cancelled successfully.");
		saveVehicleBookingSafely();
	}

	private static VehicleBooking fingvehicleBookingsById(String apid) {
		// TODO Auto-generated method stub
		for (VehicleBooking v : vehicleBookings) {
			if (v.bookingid.equals(apid)) {
				System.out.println("Customer is found");
				return v;
			}
		}
		return null;
	}

	private static void updateCustomer() {
		// TODO Auto-generated method stub
		scanner.nextLine();
		System.out.println("Enter the Vehicle Booking  Id:");
		String apid = scanner.nextLine();
		VehicleBooking obj = fingvehicleBookingsById(apid);
		if (obj == null) {
			System.out.println("No Vehicle Booking found with id: " + apid);
			return;
		}
		Customer pobj = obj.getCustomer();
		System.out.println("Enter the name to update:");
		String u_name = scanner.nextLine();
		pobj.setName(u_name);
		System.out.println("Name updated succesfully");
		saveCustomerSafely();
		saveVehicleBookingSafely();
	}

	private static void showVehicles() {
		System.out.println("\n📋 Available Vehicles:");
		for (Vehicle v : vehicles)
			v.displayVehicle();

	}

	private static void CustomerRegisteration() {
		// TODO Auto-generated method stub
		scanner.nextLine(); // consume newline
		System.out.print("Enter Customer ID: ");
		String id = scanner.nextLine();
		for (Customer p : customers) {
			if (p.getCustomerId().equals(id)) {
				System.out.println("Customer already exist!");
				return;
			}
		}

		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Age: ");
		String age = scanner.nextLine();
		scanner.nextLine();
		System.out.print("Enter Contact: ");
		String contact = scanner.nextLine();
		Customer obj = new Customer(name, id, contact, age);
		customers.add(obj);
		saveCustomerSafely();

		System.out.println("Customer registered successfully!" + customers);

	}

	private static void booking() {
		scanner.nextLine(); // consume newline
		System.out.print("Enter Customer ID: ");
		String cid = scanner.nextLine();
		for (VehicleBooking p : vehicleBookings) {
			Customer obj = p.getCustomer();
			String oldid = obj.getCustomerId();
			if (cid.equals(oldid)) {
				System.out.println("Already Booked!");
				return;
			}

		}
		Customer customer = findCustomerById(cid);
		if (customer == null) {
			System.out.println("Customer not found.. Try to register");
			return;
		}

		System.out.print("Enter Vehicle Id: ");
		String vid = scanner.nextLine();

		Vehicle vehicle = findVehicleById(vid);
		if (vehicle == null) {
			System.out.println("Vehicle not found");
			return;
		}

		System.out.print("Enter number of days: ");
		int days = scanner.nextInt();
		scanner.nextLine();
		/*
		 * String bookingid; Customer customer; Vehicle vehicle; int days; double
		 * totalCost;
		 */
		String bid;
		System.out.println("Enter the booking id:");
		bid = scanner.nextLine();
		VehicleBooking book = new VehicleBooking(bid, customer, vehicle, days);
		vehicleBookings.add(book);
		saveCustomerSafely();
		saveVehicleBookingSafely();

		System.out.println("Booking Successful!");

//		         for (Vehicle v : vehicles) {
//		             if (v.getVehicleId().equalsIgnoreCase(vid)) {
//		                 try {
//		                     v.rent(days);
//		                 } catch (VehicleNotAvailableException e) {
//		                     System.out.println("NotAvailable " + e.getMessage());
//		                 }
//		                 return;
//		             }
//		         }
//		         System.out.println(" Vehicle not found.");

	}

	private static void displayVehicleBooking() {
		// TODO Auto-generated method stub

		if (VehicleBooking.isEmpty()) {
			System.out.println("not rent vehiclebooking");
			return;
		}

		for (VehicleBooking v : vehicleBookings) {
			v.displaySummary();
		}
	}

	private static Customer findCustomerById(String cid) {
		for (Customer c : customers) {
			if (c.getCustomerId().equalsIgnoreCase(cid)) {
				return c;
			}
		}
		return null;
	}

	private static Vehicle findVehicleById(String vehicleId) {
		for (Vehicle d : vehicles) {
			if (d.getVehicleId().equalsIgnoreCase(vehicleId)) {
				return d;
			}
		}
		return null;
	}

	// persistence helpers
	private static void saveCustomerSafely() {
		try {
			FileUtils.saveList(Customer_FILE, customers);
		} catch (IOException e) {
			System.err.println("Failed to save Customer: " + e.getMessage());
		}
	}

	private static void saveVehiclelSafely() {
		try {
			// Serialize
			FileUtils.saveList(Vehicke_FILE, vehicles);
		} catch (IOException e) {
			System.err.println("Failed to save : Vehicle " + e.getMessage());
		}
	}

	private static void saveVehicleBookingSafely() {
		try {
			FileUtils.saveList(VehicleBooking_FILE, vehicleBookings);
		} catch (IOException e) {
			System.err.println("Failed to save Vehicle Booking : " + e.getMessage());
		}
	}

	// deserialization
	private static void loadData() {
		try {
			customers = FileUtils.loadList(Customer_FILE);
		} catch (Exception e) {
			System.out.println("Could not load Customer, using defaults: " + e.getMessage());
		}
		try {
			vehicles = FileUtils.loadList(Vehicke_FILE);
		} catch (Exception e) {
			System.out.println("Could not load Vehicle: " + e.getMessage());
		}
		try {
			vehicleBookings = FileUtils.loadList(VehicleBooking_FILE);
		} catch (Exception e) {
			System.out.println("Could not load Vehicle Booking : " + e.getMessage());
		}
	}

	private static void saveAllData() {
		saveCustomerSafely();
		saveVehiclelSafely();
		saveVehicleBookingSafely();
		
		
		
	}
}
