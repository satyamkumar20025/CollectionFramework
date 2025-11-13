package Vihcle_Rental_System;

public class Bike extends Vehicle implements Rentable {

	/**
	 * @param vihclenumber
	 * @param vihclename
	 * @param dailyrent
	 * @param vihcletime
	 */
	public Bike(int vihclenumber, String vihclename, float dailyrent, int vihcletime) {
		super(vihclenumber, vihclename, dailyrent, vihcletime);
	}

	@Override
	public int rent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	float calculateRentalCost(int date) {
		return ;
		// TODO Auto-generated method stub
		
	}


	
}


