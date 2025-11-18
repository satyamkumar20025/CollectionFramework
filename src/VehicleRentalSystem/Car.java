package VehicleRentalSystem;

public class Car extends Vehicle  {

	/**
	 * @param vehicleId
	 * @param name
	 * @param dailyRate
	 */
	public Car(String vehicleId, String name, double dailyRate) {
		super(vehicleId, name, dailyRate);
	}


	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return  getDailyRate() * days ; 
	}


	@Override
	public void rent(int days) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void returnVehcle() {
		// TODO Auto-generated method stub
		
	}

	
 
	
}