package BankingApplication_Project;

import java.time.LocalDateTime;

public class Transaction {
	    private  LocalDateTime dateTime;
	    private  String accountNo;
	    private  String type; // DEPOSIT, WITHDRAW, EMI, ATM etc
	    private  double amount;
	    private  String remarks;

	    public Transaction(String accountNo, String type, double amount, String remarks) {
	        this.dateTime = LocalDateTime.now();
	        this.accountNo = accountNo;
	        this.type = type;
	        this.amount = amount;
	        this.remarks = remarks;
	    }

	    @Override
	    public String toString() {
	        return dateTime + " | " + type + " | ₹" + amount + " | Acc:" + accountNo + " | " + remarks;
	    }
	}

