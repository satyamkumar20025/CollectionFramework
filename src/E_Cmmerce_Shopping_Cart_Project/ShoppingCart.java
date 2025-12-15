package E_Cmmerce_Shopping_Cart_Project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Library_Management_System_Project.FileUtils;

public class ShoppingCart {

    private static List<Product> cart = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
	
    public static void main(String[] args) {
        int ch;

        do {
            System.out.println("\n===== Shopping Cart Menu =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> addItem();
                case 2 -> removeItem();
                case 3 -> viewItems();
                case 4 -> checkout();
                case 5 -> System.out.println("Exit");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (ch != 5);

        sc.close();
    }

    // Add product method
    private static void addItem() {
        int ch;
        do {
            System.out.println("\nChoose Product Type:");
            System.out.println("1. Clothing");
            System.out.println("2. Electronics");
            System.out.println("3. Grocery");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> addClothing();
                case 2 -> addElectronics();
                case 3 -> addGrocery();
                case 4 -> System.out.println("Returning to main menu...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (ch != 4);
    }

    private static void addClothing() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Product p : cart) {
            if (p.getProductId() == id) {
                System.out.println("Item already exists!");
                return;
            }
        }

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product item = new Clothing(id, name, price, qty);
        cart.add(item);
        System.out.println("Product added: " + item);
    }

    private static void addElectronics() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Product p : cart) {
            if (p.getProductId() == id) {
                System.out.println("Item already exists!");
                return;
            }
        }

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product item = new Electronics(id, name, price, qty);
        cart.add(item);
        System.out.println("Product added: " + item);
    }

    private static void addGrocery() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Product p : cart) {
            if (p.getProductId() == id) {
                System.out.println("Item already exists!");
                return;
            }
        }

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product item = new Grocery(id, name, price, qty);
        cart.add(item);
        System.out.println("Product added: " + item);
    }

    // Remove product method
    private static void removeItem() {
        System.out.print("Enter Product ID to remove: ");
        int id = sc.nextInt();

        for (Product p : cart) {
            if (p.getProductId() == id) {
              
        }

        if (p != null) {
            cart.remove(p);
            System.out.println("Product removed: " + p);
        } 
        else {
        	
            System.out.println("Product not found!");
        }
        
        }    
    }

    // View cart items
    private static void viewItems() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in cart:");
            for (Product p : cart) {
                System.out.println(p);
            }
        }
    }

    // Checkout
    private static void checkout() {
        double sum = 0;
        for (Product p : cart) {
            try {
                sum += p.applyDiscount(p.getPrice());
            } catch (InvalidCouponException e) {
                sum += p.getPrice();
            }
        }
        System.out.println("Total Payable Amount: ₹" + sum);
        System.out.println("Checkout completed!");
    }
    
	
}

