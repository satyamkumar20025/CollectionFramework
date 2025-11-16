package VehicleRentalSystem;


	public interface Rentable {
	    void rent(int days) throws VehicleNotAvailableException;
	    void returnVehicle();
	}

