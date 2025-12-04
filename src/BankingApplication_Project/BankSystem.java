package BankingApplication_Project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BankSystem {

	private static List<Customer> customers=new ArrayList<>();
	private static List<Account> accounts=new ArrayList<>();
	private static List<KYC> kycs=new ArrayList<>();
	private static List<ATMCard> atms=new ArrayList<>();
	private static List<Transaction> transactions=new ArrayList<>();
	private static List<LoanAccount> loanAccounts=new ArrayList<>();
	private static List<FixedDepositAccount>FixedDepositAccount=new ArrayList<>();

	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args) {
		int choice;


		do {
			System.out.println("\n----- Thanks Come to Boss Bank ----");
			System.out.println("1.  Registration	Customer :");
			System.out.println("2. Create Account :");
			System.out.println("3.  LOAN SERVICE");
			System.out.println("4. KYC :");

			System.out.println("5. Exit ");


			System.out.print("Enter Choice :");
			choice=sc.nextInt();
			sc.nextLine();

			switch(choice) {
			case 1 ->Registration();
			case 2 ->Account();
			case 3-> loan();
			case 4 -> kyc();

			case 5->System.out.println("Thanks Come to Boss Bank");

			default -> System.out.println("Invalid Choice.");
			}
		}
		while(choice!=5);
	}

	////////////// KYC METHOD==================}}}}}}
	///
	///
	///
	private static void kyc() {
		// TODO Auto-generated method stub
		System.out.println("do you want kyc ");

		System.out.println("Enter the kyc Id");
		String id=sc.nextLine();

		System.out.println("Customer id");
		String cid=sc.next();

		System.out.println("Enter the Account number ");
		int number =sc.nextInt();


		Account accounts= findCustomerByAccountNumber(id);
		if(accounts==null)
		{
			System.out.println("Customer  not found");
			return;
		}
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the doucument type");
		String doutype=sc.nextLine();
		System.out.println("Enter the doucument number ");
		String dounumber=sc.nextLine();
		System.out.println("Enter the issueDate");
		String iss=sc.nextLine();
		System.out.println("Enter the expiredate ");
		String ex=sc.nextLine();
		System.out.println("Enter the status ");
		String status=sc.nextLine();
		System.out.println("kyc Successful");

		KYC ppp =new KYC("id","cid","name","dounuber",iss,ex,"status");
		ppp.add(ppp);


		return;

	}  

	//////LOAN SERVICE-----------------------------------------]]]]]]]]]]
	///
	///
	///
	private static void  loan() {
		// TODO Auto-generated method stub
		sc.nextLine();
		System.out.println(".Do you apply loan ");
		System.out.print("Enter Customer ID: ");
		int cid = sc.nextInt();
		for(LoanAccount  p: loanAccounts )
		{
			Customer obj=p.getLoanAccount();
			String oldid=obj.getLoanId();
			if(cid==(oldid))
			{
				System.out.println("Already open Account!");
				return;
			}

		}
		LoanAccount loanAccounts= findLoanAccountById(cid);
		if(loanAccounts==null)
		{
			System.out.println("Customer not found.. Try to register");
			return;
		}

		System.out.print("Enter account number : ");
		long aid = sc.nextLong();

		Account accounts= findCustomerByAccountNumber(aid);
		if(accounts==null)
		{
			System.out.println("Customer  not found");
			return;
		}

		System.out.println("Enter the customer name");
		String name=sc.nextLine();
		System.out.print("Enter the customer salary:");
		double salary=sc.nextDouble();
		System.out.print("Enter the branch:");
		String bra=sc.nextLine();
		System.out.print("Enter the loan Amount");
		double  loanAmount=sc.nextDouble();
		System.out.print("Enter the  Annual Interest rate");
		double  insterestRate=sc.nextDouble();
		System.out.print("Enter the time");
		double  months=sc.nextDouble();
		System.out.print("Enter the emi");
		double  emi=sc.nextDouble();
		System.out.println("Enter the total interest rate ");
		double  totalinterest=sc.nextDouble();
		System.out.println("Enter the payment interest rate ");

		double  payment=sc.nextDouble();

		System.out.print("Enter the loan Tenure(in Mouths): ");
		double  loanTenure=sc.nextDouble();

		System.out.println("loan Successful");
		LoanAccount  obj=new LoanAccount( "name","bra",insterestRate,months,emi,loanTenure,payment,totalinterest,salary);
		obj.add(obj);

	}


	///////////Account SERVICE----------------------------------]]]]]]]
	///
	///
	///
	private static void Account() {
		// TODO Auto-generated method stub
		int ch;

		do {

			System.out.println("1.Current Accounts");
			System.out.println("2.Saving Accounts");
			System.out.println("3. ATM CARD SERVICE :");
			System.out.println("4.  FD Account SERVICE ");

			System.out.println("5.Exit");

			System.out.print("Enter Choice :");
			ch=sc.nextInt();
			sc.nextLine();

			switch(ch)
			{
			case 1->Current();
			case 2->saving();
			case 3->atm();
			case 4->fd();
			case 5->System.out.println("Thanks Come to Boss Bank");

			default->System.out.println("Invalid Choice.");

			}
		}
		while(ch !=5);
	}
	///////New Fixed  Deposit Account*************************]]]]]]
	///
	///
	private static void fd() {
		// TODO Auto-generated method stub
		sc.nextLine(); // consume newline
		System.out.print("Enter Customer ID: ");
		int fdid = sc.nextInt();
		for(Customer  p: customers )
		{
			Customer obj=p.CustomerID();
			String oldid=obj.getCustomerName();
			if(fdid==(oldid))
			{
				System.out.println("Already open Account!");
				return;
			}
		}


		Customer customer= findCustomerById(fdid);
		if(customer==null)
		{
			System.out.println("Customer not found.. Try to register");
			return;
		}
		return ;

		System.out.print("Enter Customer name : ");
		String name = sc.nextLine();

		System.out.print("Enter principle name : ");
		double principal = sc.nextDouble();

		System.out.print("Enter interest rate name : ");
		double rate = sc.nextDouble();



		Account accounts= findCustomerByAccountNumber(fdid);
		if(accounts==null)
		{
			System.out.println("Customer  not found");
			return;
		}
		System.out.println("Enter the time");
		double time=sc.nextDouble();


		System.out.println("Enter the annual");
		double Annual=sc.nextDouble();

		System.out.println("Enter the compound rate ");
		double n=sc.nextDouble();


		FixedDepositAccount obj=new FixedDepositAccount(fdid,name,principal,rate,time,Annual,n);


		return ;
	}

	//////////// ATM SERVICE++++++++++++++++++++++++++]]]]]]]]
	///
	///
	///
	private static void atm() {
		// TODO Auto-generated method stub
		sc.nextLine(); // consume newline
		System.out.print("Enter Customer ID: ");
		int cid = sc.nextInt();
		for(Customer  p: customers )
		{
			String obj=p.getCustomerBranch();
			String oldid=obj.getCustomerName();
			if(cid==(oldid))
			{
				System.out.println("Already open Account!");
				return;
			}

		}
		Customer customer= findCustomerById(cid);
		if(customer==null)
		{
			System.out.println("Customer not found.. Try to register");
			return;
		}
		return ;

		System.out.print("Enter the  card number : ");
		String aid = sc.nextLine();

		System.out.print("Enter the  card holer name : ");
		String name = sc.nextLine();
		System.out.print("Enter the  card pin : ");
		int pin = sc.nextInt();
		System.out.print("Enter the  card ecpirydate : ");
		String ex = sc.nextLine();

		Account accounts= findCustomerByAccountNumber(aid);
		if(accounts==null)
		{
			System.out.println("Customer  not found");
			return;
		}
		System.out.println("Enter the baleance");
		double baleance=sc.nextDouble();
		ATMCard obj=new ATMCard(aid,name,pin,ex);
		atms.add(obj);



		return ;
	}
	//////Saving Account=========================}}}}}}
	///
	///
	///
	private static void saving() {

		sc.nextLine(); // consume newline
		System.out.print("Enter Customer ID: ");
		int cid = sc.nextInt();
		for(Customer  p: customers )
		{
			Customer obj=p.getCustomerBranch();
			String oldid=obj.getCustomerName();
			if(cid==(oldid))
			{
				System.out.println("Already open Account!");
				return;
			}

		}
		Customer customer= findCustomerById(cid);
		if(customer==null)
		{
			System.out.println("Customer not found.. Try to register");
			return;
		}
		return ;

		System.out.print("Enter account number : ");
		long aid = sc.nextLong();

		Account accounts= findCustomerByAccountNumber(aid);
		if(accounts==null)
		{
			System.out.println("Customer  not found");
			return;
		}
		System.out.println("Enter the baleance");
		double baleance=sc.nextDouble();
		SavingAccount obj=new SavingAccount("cid",aid,baleance);

	}
	////// Current Account=========================}}}}}}
	///
	///
	///
	private static void Current() {
		sc.nextLine(); // consume newline
		System.out.print("Enter Customer ID: ");
		int cid = sc.nextInt();
		for(Customer  p: customers )
		{
			Customer obj=p.getCustomerBranch();
			String oldid=obj.getCustomerId();
			if(cid==(oldid))
			{
				System.out.println("Already open Account!");
				return;
			}

		}
		Customer customer= findCustomerById(cid);
		if(customer==null)
		{
			System.out.println("Customer not found.. Try to register");
			return;
		}
		return ;

		System.out.print("Enter account number : ");
		long aid = sc.nextLong();

		Account accounts= findCustomerByAccountNumber(aid);
		if(accounts==null)
		{
			System.out.println("Customer  not found");
			return;
		}
		System.out.println("Enter the baleance");
		double baleance=sc.nextDouble();
		CurrentAccount obj=new CurrentAccount("cid",aid,baleance);


	}

	/////findCustomer By Account Number_____________________\\\\\
	///	
	///
	///
	private static Customer findCustomerByAccountNumber(long acno) {
		// TODO Auto-generated method stub

		for(Customer a: customers)
		{
			if(a.getCustomerAccountNumber()==(acno)) {

				return a;
			}
		}

		return null;
	}

	/// //  find Customer By Id-----------------}}}}
	///
	///
	private static Customer findCustomerById(int cid) {
		for (Customer c : customers) {
			if (c.getCustomerID()==(cid)) {
				return c;
			}
		}
		return null;

	}
	////////// Registration New Customer++++++++++++]]]]]
	///
	/// 
	private static void Registration() {
		// TODO Auto-generated method stub
		sc.nextLine(); // consume newline
		System.out.print("Enter Customer ID: ");
		int id = sc.nextInt();
		for(Customer p: customers)
		{
			if(p.CustomerID==(id))
			{
				System.out.println("Customer already exist!");
				return;
			}
		}

		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Entet Customer fathet name ");
		String fathername =sc.nextLine();
		System.out.println("Enter Customer gender ");
		String gender=sc.nextLine();
		System.out.println("Entet the Customer age ");
		int age=sc.nextInt();
		System.out.println("Enter the mobile number");
		int mobile =sc.nextInt();
		System.out.println("Enter the Email ");
		String email=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the branch name ");
		String branch =sc.next();
		System.out.println("Entet the address");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.println("Enter the CustomerAccountNumber");
		int CustomerAccountNumber=sc.nextInt();

		Customer obj = new  Customer( id,CustomerAccountNumber,name,fathername,email,mobile,age,gender,address,branch);
		customers.add(obj); 
		System.out.println("Customer registered Successfully");

	}

	public static List<KYC> getKycs() {
		return kycs;
	}

	public static void setKycs(List<KYC> kycs) {
		BankSystem.kycs = kycs;
	}

	public static List<Transaction> getTransactions() {
		return transactions;
	}

	public static void setTransactions(List<Transaction> transactions) {
		BankSystem.transactions = transactions;
	}

	public static List<LoanAccount> getLoanAccounts() {
		return loanAccounts;
	}

	public static void setLoanAccounts(List<LoanAccount> loanAccounts) {
		BankSystem.loanAccounts = loanAccounts;
	}


	public static List<Account> getAccounts() {
		return accounts;
	}


	public static void setAccounts(List<Account> accounts) {
		BankSystem.accounts = accounts;
	}


	public static List<FixedDepositAccount> getFixedDepositAccount() {
		return FixedDepositAccount;
	}


	public static void setFixedDepositAccount(List<FixedDepositAccount> fixedDepositAccount) {
		FixedDepositAccount = fixedDepositAccount;
	}




}