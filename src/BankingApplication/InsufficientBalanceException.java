package BankingApplication;

public class InsufficientBalanceException extends Exception{

	/**
	 * 
	 */
	public InsufficientBalanceException(String messages) {
		super( messages);
	}


}
