package BankingApplication_Project;

public class ATMService {

	
	public boolean login(Account accountnumber,int pin)
	{
		if(Account.getpin()==pin)
		{
			System.out.println("login customer successful");
			return true;
		}
		else {
			System.out.println("Not login customer ");
			return false;
		}
		
	}
	public void  checkBalance(String accountnumber)
	{
		System.out.println("Available balance "Account.getBalance());

	}
	
}
