package Vihcle_Rental_System;

public class Car extends Vehicle implements Rentable {

	


	 /**
	 * @param vihclenumber
	 * @param vihclename
	 * @param dailyrent
	 * @param vihcletime
	 */
	public Car(int vihclenumber, String vihclename, float dailyrent, int vihcletime) {
		super(vihclenumber, vihclename, dailyrent, vihcletime);
	}

	 @Override
	 public int rent() {
		// TODO Auto-generated method stub
		return 500;
	 }

	 @Override
	 float calculateRentalCost(int date) {
		// TODO Auto-generated method stub
		
	 }

	
	
}