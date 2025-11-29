package BankingApplication_Project;

import java.util.ArrayList;
import java.util.List;



public class CustomerService {



	    // Add new customer
	 public void addCustomer(Customer customer)
	 {
		 customer.add(customer);
	 }

	    // Search customer by ID
	 public Customer searchCustomer(String customername )
	 {
		 for(Customer c: customer)
		 {
			 if(c.equals(customername).equalsIgnoreCase(customername))
			 {
				 return c;
			 }
		 }
		 return null;
	 }
	    

	    // Update customer
	 
	 
	    // Delete customer
	  

	    // Show all customers
	  
	}

