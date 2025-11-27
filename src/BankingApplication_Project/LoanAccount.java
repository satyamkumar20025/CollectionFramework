package BankingApplication_Project;

import java.util.Scanner;

public class LoanAccount extends Account {

	
	private int loan_id;
	private double loan_Amount;
	private String  cust_name,bra;
	private double  interest_Rate;
	private double months;
	private double  emi;
	private double  loan_Tenure;
	private double  payment;
	private double total_payment;
	private double salary;

	 
	 

	 /**
	 * @param customers
	 * @param accountnumber
	 * @param balance
	 * @param loan_id
	 * @param loan_Amount
	 * @param cust_name
	 * @param bra
	 * @param interest_Rate
	 * @param months
	 * @param emi
	 * @param loan_Tenure
	 * @param payment
	 * @param total_payment
	 * @param salary
	 */
	public LoanAccount(String customers, int accountnumber, int balance, int loan_id, double loan_Amount,
			String cust_name, String bra, double interest_Rate, double months, double emi, double loan_Tenure,
			double payment, double total_payment, double salary) {
		super(customers, accountnumber, balance);
		this.loan_id = loan_id;
		this.loan_Amount = loan_Amount;
		this.cust_name = cust_name;
		this.bra = bra;
		this.interest_Rate = interest_Rate;
		this.months = months;
		this.emi = emi;
		this.loan_Tenure = loan_Tenure;
		this.payment = payment;
		this.total_payment = total_payment;
		this.salary = salary;
	}
       void calculateEMI()
       {
           emi=(loan_Amount*interest_Rate*Math.pow(1+ interest_Rate,months))/
        		   (Math.pow(1+interest_Rate, months)-1);
        
		
		}
       void payment()
        {
    	   payment=emi*months;
      
        	
        }
        void Totalinterest()
        {
        	total_payment=payment-loan_Amount;
        }
        
	   void Eligible()
	   {
		   if(loan_Amount<=10*salary)
		   {
			   System.out.print("LOAN APPROVE");
		   }
		   else {
			   System.out.print("LOAN NOT APPROVE");

		   }
	   }
	void displayAccountDetails()
	{
		System.out.println(" name"+cust_name);
		System.out.println(" customer id"+loan_id);
		System.out.println(" customer salary"+salary);
		System.out.println("loan Amount"+loan_Amount);
		System.out.println("Annual interest Amount"+interest_Rate);
		System.out.println(" loan time"+months);
		System.out.println(" branch name"+bra);
		System.out.println(" TOTAL EMI AMOUNT"+emi);
		System.out.println("loan_Tenure "+loan_Tenure);
		System.out.println("total interest "+total_payment);
		System.out.println("payment "+payment);

		

		}
	@Override
	public void performTransaction(double amount, int choice)
			throws InvalidAmountException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		
	}
	@Override
	void deposit(double amount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		
	}
	@Override
	void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		
	}
	
}
