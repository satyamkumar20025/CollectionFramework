package VehicleRentalSystem;


public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String name;
    private double dailyRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId, String name, double dailyRate) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.dailyRate = dailyRate;
        this.isAvailable = true;
    }

    
    
    public abstract double calculateRentalCost(int days);

  

    public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void displayInfo() {
        System.out.println(vehicleId + " | " + name + " | " + dailyRate + "/day | " + (isAvailable ? "Available" : "Rented"));
    }
}
