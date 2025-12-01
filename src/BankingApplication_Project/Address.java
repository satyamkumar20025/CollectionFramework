package BankingApplication_Project;

public class Address {

	
	protected String housenumber;
	protected String Street;
	protected String city;
	protected String state;
	protected String country;
	protected String pincode;
	/**
	 * @param housenumber
	 * @param street
	 * @param city
	 * @param state
	 * @param country
	 * @param pincode
	 */
	public Address(String housenumber, String street, String city, String state, String country, String pincode) {
		super();
		this.housenumber = housenumber;
		this.Street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public String getStreet() {
		return Street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getPincode() {
		return pincode;
	}
	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", Street=" + Street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
	
}
