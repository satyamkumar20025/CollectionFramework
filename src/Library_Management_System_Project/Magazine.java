package Library_Management_System_Project;

public class Magazine extends Libraryltem {

	/**
	 * @param ltemid
	 * @param status
	 * @param borrow
	 */
	public Magazine(int ltemid, String status, int borrow) {
		super(ltemid, status, borrow);
	}

	@Override
	public String toString() {
		return "Magazine [getLtemid()=" + getLtemid() + ", getStatus()=" + getStatus() + ", getBorrow()=" + getBorrow()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	@Override
	public void borrow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculatePenalty(int daysLate) {
		// TODO Auto-generated method stub
		
	}

}
