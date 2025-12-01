package BankingApplication_Project;

import java.time.LocalDate;

public class FixedDepositAccount extends Account {


        private String fdId;
	    private String ownername;
	    private double principal;
	    private double interestRate;
	    private double time;
	    private double AnnualInteresRate;
	    private int n; ///compounding frequency
	
	
	/**
		 * @param customerName
		 * @param accountnumber
		 * @param balance
		 * @param fdId
		 * @param ownername
		 * @param principal
		 * @param interestRate
		 * @param time
		 * @param annualInteresRate
		 * @param n
		 */
		public FixedDepositAccount(String customerName, long accountnumber, double balance, String fdId,
				String ownername, double principal, double interestRate, double time, double annualInteresRate, int n) {
			super(customerName, accountnumber, balance);
			this.fdId = fdId;
			this.ownername = ownername;
			this.principal = principal;
			this.interestRate = interestRate;
			this.time = time;
			AnnualInteresRate = annualInteresRate;
			this.n = n;
		}
		
		
		
	double simpleInterest()
	{
		return  (principal+(principal*interestRate*time)/100);
	}
	double compoundInterest()
	{
		double maturityAmount= principal*Math.pow((1+AnnualInteresRate/(n*100)),n*time);
		
		return maturityAmount;
		
	}



	@Override
	public String toString() {
		return "FixedDepositAccount [fdId=" + fdId + ", ownername=" + ownername + ", principal=" + principal
				+ ", interestRate=" + interestRate + ", time=" + time + ", AnnualInteresRate=" + AnnualInteresRate
				+ ", n=" + n + ", customerName=" + customerName + ", Accountnumber=" + Accountnumber + ", balance="
				+ balance + "]";
	}



	public String getFdId() {
		return fdId;
	}



	public void setFdId(String fdId) {
		this.fdId = fdId;
	}



	public String getOwnername() {
		return ownername;
	}



	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}



	public double getPrincipal() {
		return principal;
	}



	public void setPrincipal(double principal) {
		this.principal = principal;
	}



	public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	public double getTime() {
		return time;
	}



	public void setTime(double time) {
		this.time = time;
	}



	public double getAnnualInteresRate() {
		return AnnualInteresRate;
	}



	public void setAnnualInteresRate(double annualInteresRate) {
		AnnualInteresRate = annualInteresRate;
	}



	public int getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
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



	@Override
	public void displayAccountDetails() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	}


