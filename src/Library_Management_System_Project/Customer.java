package Library_Management_System_Project;

public class Customer {

	private String Customername;
	private int  ltemId;
	private String ltemname;
	private String  title;
	private int borrowLimit;
	/**
	 * @param customername
	 * @param ltemId
	 * @param ltemname
	 * @param title
	 * @param borrowLimit
	 */
	public Customer(String customername, int ltemId, String ltemname, String title, int borrowLimit) {
		super();
		Customername = customername;
		this.ltemId = ltemId;
		this.ltemname = ltemname;
		this.title = title;
		this.borrowLimit = borrowLimit;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public int getLtemId() {
		return ltemId;
	}
	public void setLtemId(int ltemId) {
		this.ltemId = ltemId;
	}
	public String getLtemname() {
		return ltemname;
	}
	public void setLtemname(String ltemname) {
		this.ltemname = ltemname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getBorrowLimit() {
		return borrowLimit;
	}
	public void setBorrowLimit(int borrowLimit) {
		this.borrowLimit = borrowLimit;
	}
	@Override
	public String toString() {
		return "Customer [Customername=" + Customername + ", ltemId=" + ltemId + ", ltemname=" + ltemname + ", title="
				+ title + ", borrowLimit=" + borrowLimit + ", getCustomername()=" + getCustomername() + ", getLtemId()="
				+ getLtemId() + ", getLtemname()=" + getLtemname() + ", getTitle()=" + getTitle()
				+ ", getBorrowLimit()=" + getBorrowLimit() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


}
