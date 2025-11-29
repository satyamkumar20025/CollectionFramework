package BankingApplication_Project;


public class LoanAccount extends Account {

    private int loanId;
    private double loanAmount;
    private String customerName, branch;
    private double interestRate;
    private double months;
    private double emi;
    private double loanTenure;
    private double payment;
    private double totalInterest;
    private double salary;

   

    /**
	 * @param customerName
	 * @param accountnumber
	 * @param balance
	 * @param loanId
	 * @param loanAmount
	 * @param customerName2
	 * @param branch
	 * @param interestRate
	 * @param months
	 * @param emi
	 * @param loanTenure
	 * @param payment
	 * @param totalInterest
	 * @param salary
	 */
	public LoanAccount(String customerName, long accountnumber, double balance, int loanId, double loanAmount,
			String customerName2, String branch, double interestRate, double months, double emi, double loanTenure,
			double payment, double totalInterest, double salary) {
		super(customerName, accountnumber, balance);
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		customerName = customerName2;
		this.branch = branch;
		this.interestRate = interestRate;
		this.months = months;
		this.emi = emi;
		this.loanTenure = loanTenure;
		this.payment = payment;
		this.totalInterest = totalInterest;
		this.salary = salary;
	}

	
	
	
	@Override
	public String toString() {
		return "LoanAccount [loanId=" + loanId + ", loanAmount=" + loanAmount + ", customerName=" + customerName
				+ ", branch=" + branch + ", interestRate=" + interestRate + ", months=" + months + ", emi=" + emi
				+ ", loanTenure=" + loanTenure + ", payment=" + payment + ", totalInterest=" + totalInterest
				+ ", salary=" + salary + "]";
	}




	public int getLoanId() {
		return loanId;
	}




	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}




	public double getLoanAmount() {
		return loanAmount;
	}




	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}




	public String getCustomerName() {
		return customerName;
	}




	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




	public String getBranch() {
		return branch;
	}




	public void setBranch(String branch) {
		this.branch = branch;
	}




	public double getInterestRate() {
		return interestRate;
	}




	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}




	public double getMonths() {
		return months;
	}




	public void setMonths(double months) {
		this.months = months;
	}




	public double getEmi() {
		return emi;
	}




	public void setEmi(double emi) {
		this.emi = emi;
	}




	public double getLoanTenure() {
		return loanTenure;
	}




	public void setLoanTenure(double loanTenure) {
		this.loanTenure = loanTenure;
	}




	public double getPayment() {
		return payment;
	}




	public void setPayment(double payment) {
		this.payment = payment;
	}




	public double getTotalInterest() {
		return totalInterest;
	}




	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public void calculateEMI() {
        emi = (loanAmount * interestRate * Math.pow(1 + interestRate, months)) /
                (Math.pow(1 + interestRate, months) - 1);
    }

    public void calculatePayment() {
        payment = emi * months;
    }

    public void calculateTotalInterest() {
        totalInterest = payment - loanAmount;
    }

    public void checkEligibility() {
        if (loanAmount <= 10 * salary) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Not Approved");
        }
    }
    
    

    @Override
    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Loan ID: " + loanId);
        System.out.println("Salary: " + salary);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Months: " + months);
        System.out.println("Branch: " + branch);
        System.out.println("Calculated EMI: " + emi);
        System.out.println("Total Payment: " + payment);
        System.out.println("Total Interest: " + totalInterest);
    }




	@Override
	public void performTransaction(double amount, int choice)
			throws InvalidAmountException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void deposit(double amount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		
	}
    
    

}