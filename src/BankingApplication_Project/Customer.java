package BankingApplication_Project;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String customername;
	private String email;
	private int mobilenumber;
	private String address;
	
	private  List<Account> accounts=new ArrayList<>();
	private static List<Customer> customer=new ArrayList<>();


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



	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", email=" + email + ", mobilenumber=" + mobilenumber
				+ ", address=" + address + "]";
	}


	void displayAllAccounts() {

		for(Account acc :accounts)

			acc.displayAccountDetails();
	}
	public static List<Customer> getCustomer() {
		return customer;
	}
	public static void setCustomer(List<Customer> customer) {
		Customer.customer = customer;
	}
	public void add(Customer customer2) {
		// TODO Auto-generated method stub
		customer.add(customer2);
	}	
			
		

}
