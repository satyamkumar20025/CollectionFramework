package BankingApplication_Project;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	protected  int CustomerID;
	protected  int CustomerAccountNumber;
	protected String CustomerName;
	protected String CustomerNameFather;
	protected String email;
	protected int mobilenumber;
	protected int age;
	protected String gender;
	protected Address address;
	protected String CustomerBranch;
	



	/**
	 * @param customerID
	 * @param customerAccountNumber
	 * @param customerName
	 * @param customerNameFather
	 * @param email
	 * @param mobilenumber
	 * @param age
	 * @param gender
	 * @param address
	 * @param customerBranch
	 */
	public Customer(int customerID, int customerAccountNumber, String customerName, String customerNameFather,
			String email, int mobilenumber, int age, String gender, Address address, String customerBranch) {
		super();
		CustomerID = customerID;
		CustomerAccountNumber = customerAccountNumber;
		CustomerName = customerName;
		CustomerNameFather = customerNameFather;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.age = age;
		this.gender = gender;
		this.address = address;
		CustomerBranch = customerBranch;
	}



	@Override
	public String toString() {
		return "Customer [CustomerID=" + CustomerID + ", CustomerAccountNumber=" + CustomerAccountNumber
				+ ", CustomerName=" + CustomerName + ", CustomerNameFather=" + CustomerNameFather + ", email=" + email
				+ ", mobilenumber=" + mobilenumber + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", CustomerBranch=" + CustomerBranch + "]";
	}



	public int getCustomerID() {
		return CustomerID;
	}



	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}



	public int getCustomerAccountNumber() {
		return CustomerAccountNumber;
	}



	public void setCustomerAccountNumber(int customerAccountNumber) {
		CustomerAccountNumber = customerAccountNumber;
	}



	public String getCustomerName() {
		return CustomerName;
	}



	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}



	public String getCustomerNameFather() {
		return CustomerNameFather;
	}



	public void setCustomerNameFather(String customerNameFather) {
		CustomerNameFather = customerNameFather;
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public String getCustomerBranch() {
		return CustomerBranch;
	}



	public void setCustomerBranch(String customerBranch) {
		CustomerBranch = customerBranch;
	}



	public void add(List<Customer> customerss) {
		// TODO Auto-generated method stub
		
	}

			
		

}
