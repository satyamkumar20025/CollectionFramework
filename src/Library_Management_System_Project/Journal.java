package Library_Management_System_Project;

public class Journal extends Libraryltem{

    /**
	 * @param ltemid
	 * @param available
	 * @param title
	 * @param borrowLimit
	 */
	public Journal(String ltemid, boolean available, String title, int borrowLimit) {
		super(ltemid, available, title, borrowLimit);
	}

	@Override
	public String toString() {
		return "Journal [ltemid=" + ltemid + ", Available=" + Available + ", title=" + title + ", borrowLimit="
				+ borrowLimit + "]";
	}

	@Override
    public double calculatePenalty(int daysLate) {
        return daysLate * 5.0; // 
    }

    @Override
    public void borrow(int days) throws ltemNotAvailableException {
        if (!isAvailable())
            throw new ltemNotAvailableException("Book not available!");
        if (days > getBorrowLimit())
            throw new ltemNotAvailableException("Borrow limit exceeded!");
        
    }

    @Override
    public void returnItem(int daysLate) {
        if (daysLate > 0)
            System.out.println("Late Penalty: " + calculatePenalty(daysLate));
    }

}
