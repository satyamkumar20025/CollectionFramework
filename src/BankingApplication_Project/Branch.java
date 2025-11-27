package BankingApplication_Project;

public class Branch {

	private String IFSCnumber;
	private  String  branchName;
	private String branchId;
	private String city;
	private Customer customer;
	private Account account;
	/**
	 * @param iFSCnumber
	 * @param branchName
	 * @param branchId
	 * @param city
	 * @param customer
	 * @param account
	 */
	public Branch(String iFSCnumber, String branchName, String branchId, String city, Customer customer,
			Account account) {
		super();
		IFSCnumber = iFSCnumber;
		this.branchName = branchName;
		this.branchId = branchId;
		this.city = city;
		this.customer = customer;
		this.account = account;
	}
	public String getIFSCnumber() {
		return IFSCnumber;
	}
	public String getBranchName() {
		return branchName;
	}
	public String getBranchId() {
		return branchId;
	}
	public String getCity() {
		return city;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Account getAccount() {
		return account;
	}
	@Override
	public String toString() {
		return "Branch [IFSCnumber=" + IFSCnumber + ", branchName=" + branchName + ", branchId=" + branchId + ", city="
				+ city + ", customer=" + customer + ", account=" + account + "]";
	}
	
	
	
	
}
