package Vihcle_Rental_System;


public class Customer {

	 private  String name;
	 private String contact;
	 private String age;
	 private String AadharCard;
	 private String type;
    
	
	/**
	 * @param name
	 * @param contact
	 * @param age
	 * @param aadharCard
	 * @param type
	 */
	public Customer(String name, String contact, String age, String aadharCard, String type) {
		super();
		this.name = name;
		this.contact = contact;
		this.age = age;
		this.AadharCard = aadharCard;
		this.type = type;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getAadharCard() {
		return AadharCard;
	}


	public void setAadharCard(String aadharCard) {
		AadharCard = aadharCard;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
}