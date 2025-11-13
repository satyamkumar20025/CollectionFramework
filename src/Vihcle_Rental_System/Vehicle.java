package Vihcle_Rental_System;

public abstract class Vehicle implements Rentable {
	private int vihclenumber;
	private String vihclename;
	private float dailyrent;
	/**
	 * @param vihclenumber
	 * @param vihclename
	 * @param dailyrent
	 * @param vihcletime 
	 */
	public Vehicle(int vihclenumber, String vihclename, float dailyrent, int vihcletime) {
		super();
		this.vihclenumber = vihclenumber;
		this.vihclename = vihclename;
		this.dailyrent = dailyrent;
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
	abstract float calculateRentalCost(int date);

}