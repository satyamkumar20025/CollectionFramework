package BankingApplication_Project;

public class LoanService {

	
	    private double loanAmount;
	    private double remainingAmount;
	    private double emiPerMonth;
	    private boolean loanActive = false;
		/**
		 * @param loanAmount
		 * @param remainingAmount
		 * @param emiPerMonth
		 * @param loanActive
		 */
		public LoanService(double loanAmount, double remainingAmount, double emiPerMonth, boolean loanActive) {
			super();
			this.loanAmount = loanAmount;
			this.remainingAmount = remainingAmount;
			this.emiPerMonth = emiPerMonth;
			this.loanActive = loanActive;
		}
		@Override
		public String toString() {
			return "LoanService [loanAmount=" + loanAmount + ", remainingAmount=" + remainingAmount + ", emiPerMonth="
					+ emiPerMonth + ", loanActive=" + loanActive + "]";
		}
		public double getLoanAmount() {
			return loanAmount;
		}
		public double getRemainingAmount() {
			return remainingAmount;
		}
		public double getEmiPerMonth() {
			return emiPerMonth;
		}
		public boolean isLoanActive() {
			return loanActive;
		}

	    
	    
}    
	    
	    
	 