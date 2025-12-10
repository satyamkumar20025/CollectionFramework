package Library_Management_System_Project;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LibrarySystem {

	
	
	private static List<Libraryltem> items = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	// persistence files
		private static final File DATA_DIR = new File(System.getProperty("user.dir"), "data");
		private static final File Libraryltem_FILE = new File(DATA_DIR, "Libraryltem.ser");
		private static final File Customer = new File(DATA_DIR, "Customer.ser");
		private static final File Bookingltem_FILE = new File(DATA_DIR, "Bookingltem.ser");

		


	    public static void main(String[] args) {
	        seedItems(); // default entries
	        int choice;

	        do {
	            System.out.println("\n--- Library Management System ---");
	            System.out.println("1. Display Items");
	            System.out.println("2. Borrow Item");
	            System.out.println("3. Return Item");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1 -> displayItems();
	                case 2 -> borrowItem();
	                case 3 -> returnItem();
	                case 4 -> System.out.println("Thank you!");
	                default -> System.out.println("Invalid choice");
	            }
	        } while (choice != 4);
	    }

	    private static void seedItems() {
	        items.add(new Book("B101", false,"Java Programming", 10));
	        items.add(new Magazine("M201",false, "Tech World", 5));
	        items.add(new Journal("J301",false, "Science Research", 3));
	    }

	    private static void displayItems() {
	        System.out.println("\nAvailable Library Items:");
	        for (Libraryltem item : items)
	            System.out.println(item.getLtemid() + " | " + item.getTitle() + " | Available: " + item.isAvailable());
	    }

	    private static void borrowItem() {
	        System.out.print("Enter Item ID: ");
	        String id = sc.next();

	        for (Libraryltem item : items) {
	            if (item.getLtemid().equalsIgnoreCase(id)) {
	                System.out.print("Days to borrow: ");
	                int days = sc.nextInt();
	                try {
	                    item.borrow(days);
	                	saveLibraryltemSafely();
	                    System.out.println("\nBorrow Successful! Receipt generated.");
	                } catch (ltemNotAvailableException e) {
	                    System.out.println(e.getMessage());
	                }
	                return;
	            }
	        }
	        System.out.println("Item not found!");
	    }

	    private static void returnItem() {
	        System.out.print("Enter Item ID: ");
	        String id = sc.next();

	        for (Libraryltem item : items) {
	            if (item.getLtemid().equalsIgnoreCase(id)) {
	                System.out.print("Days late: ");
	                int lateDays = sc.nextInt();
	                item.returnItem(lateDays);
	            	saveLibraryltemSafely();
					saveCustomerSafely();
	                return;
	            }
	        }
	        System.out.println("Item not found!");
	    }

		// persistence helpers
			private static void saveLibraryltemSafely() {
				try {
					FileUtils.saveList(Libraryltem_FILE, items);
				} catch (IOException e) {
					System.err.println("Failed to save Libraryltem: " + e.getMessage());
				}
			}

			private static void saveCustomerSafely() {
				try {
					// Serialize
					FileUtils.saveList(Customer, items);
				} catch (IOException e) {
					System.err.println("Failed to save : Customer " + e.getMessage());
				}
			}

			private static void saveBookingltemSafely() {
				try {
					FileUtils.saveList(Bookingltem_FILE, items);
				} catch (IOException e) {
					System.err.println("Failed to save ltem Booking : " + e.getMessage());
				}
			}

			// deserialization
			
			private static void loadData() {
				try {
					items = FileUtils.loadList(Libraryltem_FILE);
				} catch (Exception e) {
					System.out.println("Could not load Libraryltem, using defaults: " + e.getMessage());
				}
				try {
					items = FileUtils.loadList(Customer);
				} catch (Exception e) {
					System.out.println("Could not load Customer: " + e.getMessage());
				}
				try {
					items = FileUtils.loadList(Bookingltem_FILE);
				} catch (Exception e) {
					System.out.println("Could not load bookingltem : " + e.getMessage());
				}
			}

			private static void saveAllData() {
				saveLibraryltemSafely();
				saveCustomerSafely();
				saveBookingltemSafely();
				
				
				
			}
		}
	