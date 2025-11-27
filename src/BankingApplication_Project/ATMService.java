package BankingApplication_Project;

public class ATMService {

	private BankService bankService;

	/**
	 * @param bankService
	 */
	public ATMService(BankService bankService) {
		super();
		this.bankService = bankService;
	}

	public BankService getBankService() {
		return bankService;
	}

	@Override
	public String toString() {
		return "ATMService [bankService=" + bankService + "]";
	}
	
	
	
}
