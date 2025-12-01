package Library_Management_System_Project;

public abstract class Libraryltem implements Borrowable {


	protected String ltemid;
	protected boolean Available =true;
	protected String title;
	protected int borrowLimit;
	
	 abstract double calculatePenalty(int daysLate);

	 /**
 	 * @param ltemid
 	 * @param available
 	 * @param title
 	 * @param borrowLimit
 	 */
	 public Libraryltem(String ltemid, boolean available, String title, int borrowLimit) {
		super();
		this.ltemid = ltemid;
		Available = available;
		this.title = title;
		this.borrowLimit = borrowLimit;
	 }

	 @Override
	 public String toString() {
		return "Libraryltem [ltemid=" + ltemid + ", Available=" + Available + ", title=" + title + ", borrowLimit="
				+ borrowLimit + "]";
	 }

	 public String getLtemid() {
		 return ltemid;
	 }

	 public boolean isAvailable() {
		 return Available;
	 }

	 public String getTitle() {
		 return title;
	 }

	 public int getBorrowLimit() {
		 return borrowLimit;
	 }
	

	
}
