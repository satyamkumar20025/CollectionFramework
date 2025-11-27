package BankingApplication_Project;

public class BankService {


	    public void deposit(Account account, double amount) throws InvalidAmountException {
	        account.deposit(amount);
	        System.out.println("Deposit successful ₹" + amount);
	    }

	    public void withdraw(Account account, double amount) throws InvalidAmountException, InsufficientBalanceException {
	        account.withdraw(amount);
	        System.out.println("Withdrawal request: ₹" + amount);
	    }

	    public void checkBalance(Account account) {
	        System.out.println("Balance: ₹" + account.getBalance());
	    }
	}
	

