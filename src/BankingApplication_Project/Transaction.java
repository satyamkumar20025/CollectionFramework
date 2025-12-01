package BankingApplication_Project;

import java.time.LocalDateTime;


////Bank recode save
public class Transaction {
	    
	   private String TransactionId;
	    private  String type; // DEPOSIT, WITHDRAW, transfer
	    private  double amount;
	   private int accountnumber;
	   private String status;///success failed
	   /**
 	   * @param transactionId
 	   * @param type
 	   * @param amount
 	   * @param accountnumber
 	   * @param status
 	   */
	   public Transaction(String transactionId, String type, double amount, int accountnumber, String status) {
		super();
		TransactionId = transactionId;
		this.type = type;
		this.amount = amount;
		this.accountnumber = accountnumber;
		this.status = status;
	   }
	   @Override
	   public String toString() {
		return "Transaction [TransactionId=" + TransactionId + ", type=" + type + ", amount=" + amount
				+ ", accountnumber=" + accountnumber + ", status=" + status + "]";
	   }
	   public String getTransactionId() {
		   return TransactionId;
	   }
	   public void setTransactionId(String transactionId) {
		   TransactionId = transactionId;
	   }
	   public String getType() {
		   return type;
	   }
	   public void setType(String type) {
		   this.type = type;
	   }
	   public double getAmount() {
		   return amount;
	   }
	   public void setAmount(double amount) {
		   this.amount = amount;
	   }
	   public int getAccountnumber() {
		   return accountnumber;
	   }
	   public void setAccountnumber(int accountnumber) {
		   this.accountnumber = accountnumber;
	   }
	   public String getStatus() {
		   return status;
	   }
	   public void setStatus(String status) {
		   this.status = status;
	   }
	    
	    
	    
	}

