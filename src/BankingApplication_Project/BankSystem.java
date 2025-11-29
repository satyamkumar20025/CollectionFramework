package BankingApplication_Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankSystem {
	private static List<Account> accounts=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args) {
		int choice;

		do {
			System.out.println("\n----- Thanks Come to Boss Bank ----");
			System.out.println("1.  Add	Customer :");
			System.out.println("2. View Customer :");
			System.out.println("3. Update Customer  :");
			System.out.println("4. Delete Customer :");
			System.out.println("5. Show All Customer :");
			System.out.println("6. Create Account :");
			System.out.println("7. Deposit :");
			System.out.println("8. Withdraw");
			System.out.println("9.Check Balance");
			System.out.println("10. Apply Loan");
			System.out.println("11. pay Loan EMI");
			System.out.println("12. Open FD Account ");
			System.out.println("13. Close FD Account / Maturity ");
			System.out.println("14. Exit ");


			System.out.print("Enter Choice :");
			choice=sc.nextInt();

			switch(choice) {
			case 1 ->AddCustomer();
			case 2 ->ViewCustomer();
			case 3-> UpdateCustomer();
			case 4-> DeleteCustomer();
			case 5 -> ShowAllCustomer();
			case 6 -> CreateAccount();
			case 7->Deposit();
			case 8->Withdraw();
			case 9->Checkbalance();
			case 10->ApplyLoan();
			case 11->payLoanAccount();
			case 12->openFDAccount();
			case 13->CloseFDAccount();
			case 14->System.out.println("Thanks Come to Boss Bank");

			default -> System.out.println("Invalid Choice.");
			}
		}
		while(choice!=14);
	}
	
private static Object CloseFDAccount() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object openFDAccount() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object payLoanAccount() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object ApplyLoan() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object Checkbalance() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object Withdraw() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object Deposit() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object CreateAccount() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object ShowAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object DeleteCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object UpdateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object ViewCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

private static Object AddCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

public static List<Account> getAccounts() {
	return accounts;
}
public static void setAccounts(List<Account> accounts) {
	BankSystem.accounts = accounts;
}


}