package Vihcle_Rental_System;

public class bookVihcle {

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
	public bookVihcle(String bookingid, Vihcle_Rental_System.Customer customer, Vihcle_Rental_System.Vehicle vehicle,
			int days, double totalCost) {
		super();
		this.bookingid = bookingid;
		this.Customer = customer;
		this.Vehicle = vehicle;
		this.days = days;
		this.totalCost = totalCost;
	} 
	
	
	
}
