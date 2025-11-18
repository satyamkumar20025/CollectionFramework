package Online_Course_Management_System;

public abstract class Course implements Enrollable {

	
	private String name;
	private float price;
	private String type;
	
	/**
	 * @param studentId
	 * @param name
	 * @param price
	 * @param type
	 */
	public Course(String name, float price, String type) {
		super();

		this.name = name;
		this.price = price;
		this.type = type;
	}


	public String getName() {
		return name;
	}



	public float getPrice() {
		return price;
	}


	public String getType() {
		return type;
	}



	public void displayAllCourse() {

	        System.out.println();
	    }
    

	abstract void ShowDetails();

	
}
