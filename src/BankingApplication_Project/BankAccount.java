package BankingApplication_Project;

public abstract class BankAccount implements Transactionable {

	protected   String customers;
	protected   int Accountnumber;
	protected   int balance;
	
	
    /**
	 * @param customers
	 * @param accountnumber
	 * @param balance
	 */
	public BankAccount(String customers, int accountnumber, int balance) {
		super();
		this.customers = customers;
		Accountnumber = accountnumber;
		this.balance = balance;
	}
	
	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public int getAccountnumber() {
		return Accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		Accountnumber = accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [customers=" + customers + ", Accountnumber=" + Accountnumber + ", balance=" + balance
				+ "]";
	}
	 abstract  void deposit(double amount) throws InvalidAmountException;
	 abstract  void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException;
	abstract void displayAccountDetails();


}
