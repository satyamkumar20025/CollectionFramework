package BankingApplication_Project;

public class LoanService {

	
	    private double loanId;
	    private double loanAmount;
	    private double remainingAmount;
	    private double emiPerMonth;
	    private boolean loanActive = true;
		/**
		 * @param loanId
		 * @param loanAmount
		 * @param remainingAmount
		 * @param emiPerMonth
		 * @param loanActive
		 */
		public LoanService(double loanId, double loanAmount, double remainingAmount, double emiPerMonth,
				boolean loanActive) {
			super();
			this.loanId = loanId;
			this.loanAmount = loanAmount;
			this.remainingAmount = remainingAmount;
			this.emiPerMonth = emiPerMonth;
			this.loanActive = loanActive;
		}
		@Override
		public String toString() {
			return "LoanService [loanId=" + loanId + ", loanAmount=" + loanAmount + ", remainingAmount="
					+ remainingAmount + ", emiPerMonth=" + emiPerMonth + ", loanActive=" + loanActive + "]";
		}
		public double getLoanId() {
			return loanId;
		}
		public void setLoanId(double loanId) {
			this.loanId = loanId;
		}
		public double getLoanAmount() {
			return loanAmount;
		}
		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}
		public double getRemainingAmount() {
			return remainingAmount;
		}
		public void setRemainingAmount(double remainingAmount) {
			this.remainingAmount = remainingAmount;
		}
		public double getEmiPerMonth() {
			return emiPerMonth;
		}
		public void setEmiPerMonth(double emiPerMonth) {
			this.emiPerMonth = emiPerMonth;
		}
		public boolean isLoanActive() {
			return loanActive;
		}
		public void setLoanActive(boolean loanActive) {
			this.loanActive = loanActive;
		}
		
		
		
		
}		
		
		
		
		
		