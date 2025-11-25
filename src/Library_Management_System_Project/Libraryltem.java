package Library_Management_System_Project;

public abstract class Libraryltem implements Borrowable {


	private int ltemid;
	private String status;
	private int borrow;
	
	
 /**
	 * @param ltemid
	 * @param status
	 * @param borrow
	 */
	public Libraryltem(int ltemid, String status, int borrow) {
		super();
		this.ltemid = ltemid;
		this.status = status;
		this.borrow = borrow;
	}


 public int getLtemid() {
	return ltemid;
}


 public void setLtemid(int ltemid) {
	this.ltemid = ltemid;
 }


 public String getStatus() {
	return status;
 }


 public void setStatus(String status) {
	this.status = status;
 }


 public int getBorrow() {
	return borrow;
 }


 public void setBorrow(int borrow) {
	this.borrow = borrow;
 }


 @Override
public String toString() {
	return "Libraryltem [ltemid=" + ltemid + ", status=" + status + ", borrow=" + borrow + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


 abstract	void calculatePenalty(int daysLate);
	

	
}
