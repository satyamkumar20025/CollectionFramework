package BankingApplication_Project;

public class Branch {

	protected String IFSCnumber;
	protected  String  branchName;
	protected String branchId;
	protected String city;
	/**
	 * @param iFSCnumber
	 * @param branchName
	 * @param branchId
	 * @param city
	 */
	public Branch(String iFSCnumber, String branchName, String branchId, String city) {
		super();
		IFSCnumber = iFSCnumber;
		this.branchName = branchName;
		this.branchId = branchId;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Branch [IFSCnumber=" + IFSCnumber + ", branchName=" + branchName + ", branchId=" + branchId + ", city="
				+ city + "]";
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
	
	
	
	
	
	
}
