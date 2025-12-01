package BankingApplication_Project;

import java.util.ArrayList;
import java.util.List;




public class CustomerService {


	

	private static List<Customer> customerss = new ArrayList<>();

	
	
	
	    // Add new customer
	        public void addCustomer(Customer customers)
	        {
	        	 customers.add(customerss);
		         System.out.println("Customer added successfully!");

	        }


	     // Search customer by name
	     public Customer searchCustomer(String name) {
	         for (Customer c : customerss) {
	             if (c.getCustomerName().equalsIgnoreCase(name)) {
	                 return c;
	             }
	         }
	         return null;
	     }

	     
	     //  find Customer By Id
	     private static Customer findCustomerById(int id) {
	    	 for (Customer c : customerss) {
	    		 if (c.getCustomerID()==(id)) {
	    			 return c;
	    		 }
	    	 }
	    	 return null;
	     }
	     
	     
	     // Update customer name
	     public void updateCustomerName(int id, String updatedCustomer) {
	             Customer c=findCustomerById(id);
	             if(c !=null) {
	                 c.setCustomerName(updatedCustomer);
;
	                 System.out.println("Customer updated successfully!");
	                 return ;
	             }
	         
	     }


	     // Update customer father Name
	     public void updateCustomerFatherName(int id, String CustomerFatherName) {
	             Customer c=findCustomerById(id);
	             if(c !=null) {
	                 c.setCustomerFatherName(CustomerFatherName);
;
	                 System.out.println("Customer updated successfully!");
	                 return ;
	             }
	         
	     }

	     

	     
	     // Update customer Branch Name
	     public void updateCustomerBranch(int id, String CustomerBranch) {
	             Customer c=findCustomerById(id);
	             if(c !=null) {
	                 c.setCustomerName(CustomerBranch);
;
	                 System.out.println("Customer updated successfully!");
	                 return ;
	             }
	         
	     }


	     // Update customer Email
	     public void updateCustomerEmail(int id, String email) {
	             Customer c=findCustomerById(id);
	             if(c !=null) {
	                 c.setCustomerName(email);
;
	                 System.out.println("Customer updated successfully!");
	                 return ;
	             }
	         }
	     

	     // Update customer mobile number
	     public void updateCustomerNumber(int id, String mobilenumer) {
	             Customer c=findCustomerById(id);
	             if(c !=null) {
	                 c.setCustomerName(mobilenumer);
;
	                 System.out.println("Customer updated successfully!");
	                 return ;
	             }
	         
	     }

	     // Delete customer
	     public void deleteCustomer(int id) {
	    	 
	         Customer c = findCustomerById(id);

	         if (c != null) {
	             customerss.remove(c);
	             System.out.println("Customer deleted successfully!");
	         } else {
	             System.out.println("Customer not found");
	         }
	     }

	 


	    // Show all customers
	    public void displayAllCustomers() {
	        for (Customer c : customerss) {
	            System.out.println(c);
	        }
	    }	 
	  
	    
	    
	}

