package BankingApplication_Project;

import java.util.Scanner;

public class CurrentAccount extends Account {


	/**
	 * @param customerName
	 * @param accountnumber
	 * @param balance
	 */
	public CurrentAccount(String customerName, long accountnumber, double balance) {
		super(customerName, accountnumber, balance);
	}



	/*
	 * @Override public String toString() { return "CurrentAccount [customerName=" +
	 * customerName + ", Accountnumber=" + Accountnumber + ", balance=" + balance +
	 * ", toString()=" + super.toString() + ", getCustomerName()=" +
	 * getCustomerName() + ", getAccountnumber()=" + getAccountnumber() +
	 * ", getBalance()=" + getBalance() + ", getClass()=" + getClass() +
	 * ", hashCode()=" + hashCode() + "]"; }
	 * 
	 */

	

	public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Invalid Amount!");
        
        balance += amount;
    }

    @Override
	public String toString() {
		return "CurrentAccount [customerName=" + customerName + ", Accountnumber=" + Accountnumber + ", balance="
				+ balance + "]";
	}



	public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
    	
        if (amount <= 0) throw new InvalidAmountException("Invalid Amount!");
        
        if (balance < amount) throw new InsufficientBalanceException("Insufficient Balance!");
        
        
        balance -= amount;
    }

	@Override
	public void performTransaction(double amount, int choice) throws InvalidAmountException, InsufficientBalanceException {
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
	

	@Override

public	void displayAccountDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("customers "+customerName);
		System.out.println("Accountnumber "+Accountnumber);
		System.out.println("balance "+balance);

	}


	


}
