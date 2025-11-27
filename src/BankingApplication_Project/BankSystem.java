package BankingApplication_Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankSystem {
	private static List<Account> accounts=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args) {
		instalizationAccount();
		int choice;

		do {
			System.out.println("\n-----Welcome to My Bank----");
			System.out.println("1.  Account	OPTION :");
			System.out.println("2. create New Account :");
			System.out.println("3. perform Transactions  :");
			System.out.println("4. Fixed Deposut :");
			System.out.println("5. Show Account Details :");
			System.out.println("6. Show Account Details :");
			System.out.println("7. Show Account Details :");
			System.out.println("8. Exit");

			System.out.print("Enter Choice :");
			choice=sc.nextInt();

			switch(choice) {
			case 1 -> instalizationAccount();
			case 2 ->createAccount();
			case 3-> performTransactions();
			case 4-> FD();
			case 5 -> showAccountDetails();
			case 6 -> System.out.println("Exit....");
			default -> System.out.println("Invalid Choice.");
			}
		}
		while(choice!=7);
	}
private static Object showAccountDetails() {
		// TODO Auto-generated method stub
		return null;
	}
private static Object FD() {
		// TODO Auto-generated method stub
		return null;
	}
private static Object performTransactions() {
		// TODO Auto-generated method stub
		return null;
	}
private static Object createAccount() {
		// TODO Auto-generated method stub
		return null;
	}
private static Object instalizationAccount() {
		// TODO Auto-generated method stub
		return null;
	}


}