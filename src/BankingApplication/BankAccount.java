package BankingApplication;

public abstract class BankAccount implements Transactionable {

	private  String customers;
	private  int Accountnumber;
	private  int balance;
	
	
	abstract void withdraw();
	

}
