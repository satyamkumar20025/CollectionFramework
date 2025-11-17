package VehicleRentalSystem;
static
public  class VehicleBooking  { 
	String bookingid;
	Customer Customer;
	Vehicle Vehicle;
	int days;
	double totalCost;
	/**
	 * @param bookingid
	 * @param customer
	 * @param vehicle
	 * @param days
	 * @param totalCost
	 */
	public VehicleBooking(String bookingid, VehicleRentalSystem.Customer customer, VehicleRentalSystem.Vehicle vehicle,
			int days, double totalCost) {
		super();
		this.bookingid = bookingid;
		this.Customer = customer;
	    this.Vehicle = vehicle;
		this.days = days;
		this.totalCost = totalCost;
	}

    public void displaySummary() {
        System.out.println("\n--- VehicleBooking Summary ---");
        System.out.println("Date: " + days);
        System.out.println("totalCost Bill: ₹" + totalCost());
    }

	
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public Customer getCustomer() {
		return Customer;
	}
	public void setCustomer(Customer customer) {
		Customer = customer;
	}
	public Vehicle getVehicle() {
		return Vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		Vehicle = vehicle;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
}
