package BankingApplication_Project;

public class InsufficientBalanceException extends Exception{

	/**
	 * 
	 */
	public InsufficientBalanceException(String messages) {
		super( messages);
	}


}
