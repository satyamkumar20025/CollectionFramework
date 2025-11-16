package VehicleRentalSystem;

public class Truck extends Vehicle  {

	/**
	 * @param vehicleId
	 * @param name
	 * @param dailyRate
	 */
	public Truck(String vehicleId, String name, double dailyRate) {
		super(vehicleId, name, dailyRate);
	}


	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return  getDailyRate() * days ;
	}

	
}

	

	 
	 
	