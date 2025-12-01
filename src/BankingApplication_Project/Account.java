package BankingApplication_Project;

public abstract class Account implements Transactionable {

	protected   String customerName;
	protected   long Accountnumber;
	protected   double balance;
	
	
	 /**
	 * @param customerName
	 * @param accountnumber
	 * @param balance
	 */
	public Account(String customerName, long accountnumber, double balance) {
		super();
		this.customerName = customerName;
		Accountnumber = accountnumber;
		this.balance = balance;
	}
	
	 @Override
	public String toString() {
		return "Account [customerName=" + customerName + ", Accountnumber=" + Accountnumber + ", balance=" + balance
				+ "]";
	}
	 

	 public String getCustomerName() {
		return customerName;
	}

	 public long getAccountnumber() {
		 return Accountnumber;
	 }

	 public double getBalance() {
		 return balance;
	 }

	public abstract  void deposit(double amount) throws InvalidAmountException;
	public abstract  void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException;
	public abstract void displayAccountDetails();

	protected static int getpin() {
		// TODO Auto-generated method stub
		return 0;
	}


}
