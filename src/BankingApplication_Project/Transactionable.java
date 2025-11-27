package BankingApplication_Project;



public interface Transactionable {
	
	public void performTransaction(double amount, int choice) throws InvalidAmountException, InsufficientBalanceException;
}