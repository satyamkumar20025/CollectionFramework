package Vihcle_Rental_System;

public class Car extends Vehicle  {
	
	 /**
	 * @param vihclenumber
	 * @param vihclename
	 * @param dailyrent
	 * @param vihcleAvailable
	 */
	public Car(int vihclenumber, String vihclename, float dailyrent, String vihcleAvailable) {
		super(vihclenumber, vihclename, dailyrent, vihcleAvailable);
	}

	 @Override
	 float calculateRentalCost( int days) {
		// TODO Auto-generated method stub
		 return getDailyrent()*days*500;
	 }
	 @Override
	 public int rent(int days) {
		// TODO Auto-generated method stub
		return 500;
	 }

	 public void getDetails() {
		// TODO Auto-generated method stub
		
	 }

	
	
}