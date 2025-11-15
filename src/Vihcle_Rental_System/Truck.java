package Vihcle_Rental_System;

public class Truck extends Vehicle  {
	

	 /**
	 * @param vihclenumber
	 * @param vihclename
	 * @param dailyrent
	 * @param vihcleAvailable
	 */
	public Truck(int vihclenumber, String vihclename, float dailyrent, String vihcleAvailable) {
		super(vihclenumber, vihclename, dailyrent, vihcleAvailable);
	}

	 @Override
	 float calculateRentalCost(int days) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		 return getDailyrent()*days*500;
	 }
	 @Override
	 public int rent(int days) {
		// TODO Auto-generated method stub
		return 500;
	 }

	 public void getDetails() {
=======
		return 500;
	 }

	 @Override
	 float calculateRentalCost(int date) {


>>>>>>> 0f84c9ad612ca6bda440298e1333c0eccac65338
		// TODO Auto-generated method stub
return date*500;
		
	 }


}

	

	 
	 
	