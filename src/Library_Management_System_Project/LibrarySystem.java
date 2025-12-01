package Library_Management_System_Project;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {

	private static List<Book>book=new ArrayList<>();
	private static List <Magazine>magazines=new ArrayList<>();
	private static List<Bookingltem>bookingltems=new ArrayList<>();
	private static List<Libraryltem> items = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);


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
	                return;
	            }
	        }
	        System.out.println("Item not found!");
	    }
	}