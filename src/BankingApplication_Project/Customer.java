package BankingApplication_Project;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String customername;
	private String email;
	private int mobilenumber;
	private String address;
	
	private static List<Account> accounts=new ArrayList<>();


	/**
	 * @param customername
	 * @param email
	 * @param mobilenumber
	 * @param address
	 */
	public Customer(String customername, String email, int mobilenumber, String address) {
		super();
		this.customername = customername;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.address = address;
	}
  public void addAccount(Account acc)
  {
	  accounts.add(acc);
  }

	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static List<Account> getAccounts() {
		return accounts;
	}


	public static void setAccounts(List<Account> accounts) {
		Customer.accounts = accounts;
	}


	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", email=" + email + ", mobilenumber=" + mobilenumber
				+ ", address=" + address + "]";
	}


	void displayAllAccounts() {

		for(Account acc :accounts)

			acc.displayAccountDetails();
	}	
			
		

}
