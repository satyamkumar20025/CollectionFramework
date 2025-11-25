package BankingApplication_Project;

import java.util.Scanner;

public class LoanAccount extends BankAccount {

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



	 
	 

	 void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the loan_idr:");
		loan_id=sc.nextInt();
		 sc.nextLine();
        System.out.print("Enter the customer name:");
        cust_name=sc.nextLine();
        System.out.print("Enter the customer salary:");
        salary=sc.nextFloat();
        System.out.print("Enter the branch:");
        bra=sc.nextLine();
        System.out.print("Enter the loan Amount");
        loan_Amount=sc.nextFloat();
        System.out.print("Enter the  Annual Interest rate");
        interest_Rate=sc.nextFloat();
        System.out.print("Enter the time");
        months=sc.nextFloat();

        System.out.print("Enter the loan Tenure(in Mouths): ");
        loan_Tenure=sc.nextFloat();
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
	void display()
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
	
}
