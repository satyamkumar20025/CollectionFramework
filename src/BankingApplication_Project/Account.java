package BankingApplication_Project;

public class Account {

	protected String accountNumber;
	protected double balance;
	protected String accountType;
	/**
	 * @param accountNumber
	 * @param balance
	 * @param accountType
	 */
	public Account(String accountNumber, double balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType
				+ "]";
	}
	
}
