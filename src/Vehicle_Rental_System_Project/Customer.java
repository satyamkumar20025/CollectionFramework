package Vehicle_Rental_System_Project;


public class Customer {

	 private  String name;
	 private  String CustomerId;
	 private String contact;
	 private String age;
	
    
	

	/**
	 * @param name
	 * @param customerId
	 * @param contact
	 * @param age
	 * @param aadharCard
	 * @param type
	 */

	
	public void displayCustomer() {
        System.out.println("\n--- VehicleBooking Summary ---");
        System.out.println("name: " + name);
        System.out.println("customerId: " + CustomerId);
        System.out.println("contact: " + contact);
        System.out.println("age: " + age);
        
    }

	


	/**
	 * @param name
	 * @param customerId
	 * @param contact
	 * @param age2
	 * @param aadharCard
	 * @param type
	 */
	public Customer(String name, String customerId, String contact, String age2) {
		super();
		this.name = name;
		CustomerId = customerId;
		this.contact = contact;
		this.age = age2;
		
	}




	public void getDetails() {
		// TODO Auto-generated method stub
		
	}
	public static void add(Customer obj) {
		// TODO Auto-generated method stub
		
	}
	public String getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		return name;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public String getContact() {
		return contact;
	}
	public String getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", CustomerId=" + CustomerId + ", age=" + age + "]";
	}
	
	
}
