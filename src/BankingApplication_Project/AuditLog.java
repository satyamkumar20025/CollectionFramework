package BankingApplication_Project;


public class AuditLog {

	private String action;
	private String accountNumber;
	private String status;
	private double amount;
	private String message;
	/**
	 * @param action
	 * @param accountNumber
	 * @param status
	 * @param amount
	 * @param message
	 */
	public AuditLog(String action, String accountNumber, String status, double amount, String message) {
		super();
		this.action = action;
		this.accountNumber = accountNumber;
		this.status = status;
		this.amount = amount;
		this.message = message;
	}
	public String getAction() {
		return action;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getStatus() {
		return status;
	}
	public double getAmount() {
		return amount;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "AuditLog [action=" + action + ", accountNumber=" + accountNumber + ", status=" + status + ", amount="
				+ amount + ", message=" + message + "]";
	}
	
	
	
}
