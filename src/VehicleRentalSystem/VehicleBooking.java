package VehicleRentalSystem;

public  class VehicleBooking  { 
	String bookingid;
	Customer customer;
	Vehicle vehicle;
	int days;
	/**
	 * @param bookingid
	 * @param customer
	 * @param vehicle
	 * @param days
	 * @param totalCost
	 */
	
	public VehicleBooking(String bookingid, Customer customer, Vehicle vehicle,int days) {
		super();
		this.bookingid = bookingid;
		this.customer = customer;
	    this.vehicle = vehicle;
		this.days = days;
		
	}

    public void displaySummary() {
        System.out.println("\n--- Vehicle Booking Summary ---");
        System.out.println("bookingid: " + bookingid);
        customer.displayCustomer();
        vehicle.displayVehicle();
        System.out.println("Date: " + days);
        System.out.println("Total Cost: " + vehicle.calculateRentalCost(days));
    }

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getBookingid() {
		return bookingid;
	}


	public Customer getCustomer() {
		return customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}


	public int getDays() {
		return days;
	}


}
