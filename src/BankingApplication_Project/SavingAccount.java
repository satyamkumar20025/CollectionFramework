package BankingApplication_Project;

import java.util.Scanner;

public class SavingAccount extends BankAccount {

	/**
	 * @param customers
	 * @param accountnumber
	 * @param balance
	 */
	public SavingAccount(String customers, int accountnumber, int balance) {
		super(customers, accountnumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SavingAccount [customers=" + customers + ", Accountnumber=" + Accountnumber + ", balance=" + balance
				+ "]";
	}


    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Invalid Amount!");
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) throw new InvalidAmountException("Invalid Amount!");
        if (balance < amount) throw new InsufficientBalanceException("Insufficient Balance!");
        balance -= amount;
    }


	@Override
	public void performTransaction(double amount, int choice) throws InvalidAmountException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice:");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		if(choice==1)
		{
			deposit(amount);
		}
		if(choice==2)
		{
			withdraw(amount);
		}
	}
	
	public int getAccountNumber() {
		return Accountnumber;
	}
	
	public String getOwnerName() {
		return getOwnerName();
	}
	public int getBalance() {
		return balance;
	}



	@Override
	void displayAccountDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("customers "+customers);
		System.out.println("Accountnumber "+Accountnumber);
		System.out.println("balance "+balance);

	}


}
