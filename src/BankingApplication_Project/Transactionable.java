package BankingApplication_Project;

public interface Transactionable {

	    void performTransaction(double amount, int choice) throws InvalidAmountException, InsufficientBalanceException;
	 
	}