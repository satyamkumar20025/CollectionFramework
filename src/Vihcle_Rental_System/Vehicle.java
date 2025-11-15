package Vihcle_Rental_System;

public abstract class Vehicle implements Rentable {
	private int vihclenumber;
	private String vihclename;
	private float dailyrent;
	private String vihcleAvailable;

	
	/**
	 * @param vihclenumber
	 * @param vihclename
	 * @param dailyrent
	 * @param vihcleAvailable
	 */
	public Vehicle(int vihclenumber, String vihclename, float dailyrent, String vihcleAvailable) {
		super();
		this.vihclenumber = vihclenumber;
		this.vihclename = vihclename;
		this.dailyrent = dailyrent;
		this.vihcleAvailable = vihcleAvailable;
	}
	public int getVihclenumber() {
		return vihclenumber;
	}
	public void setVihclenumber(int vihclenumber) {
		this.vihclenumber = vihclenumber;
	}
	public String getVihclename() {
		return vihclename;
	}
	public void setVihclename(String vihclename) {
		this.vihclename = vihclename;
	}
	public float getDailyrent() {
		return dailyrent;
	}
	public void setDailyrent(float dailyrent) {
		this.dailyrent = dailyrent;
	} 
	public String getVihcleAvailable() {
		return vihcleAvailable;
	}
	public void setVihcleAvailable(String vihcleAvailable) {
		this.vihcleAvailable = vihcleAvailable;
	}
	abstract float calculateRentalCost(int date);
	public String getVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

}