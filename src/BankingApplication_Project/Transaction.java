package BankingApplication_Project;

import java.time.LocalDateTime;

public class Transaction {
	    
	    private  String type; // DEPOSIT, WITHDRAW, EMI, ATM etc
	    private  double amount;
	   

	    public Transaction(String accountNo, String type, double amount, String remarks) {
	        this.type = type;
	        this.amount = amount;
	    }


		@Override
		public String toString() {
			return "Transaction [type=" + type + ", amount=" + amount + "]";
		}
 
	    
	    
	    
	}

