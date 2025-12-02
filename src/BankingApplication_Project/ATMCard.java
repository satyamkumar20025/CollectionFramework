package BankingApplication_Project;

public class ATMCard {

	protected String cardnumber;
	protected String holdername;
	protected int pin;
	protected int expirydate;
	/**
	 * @param cardnumber
	 * @param holdername
	 * @param pin
	 * @param expirydate
	 */
	public ATMCard(String cardnumber, String holdername, int pin, int expirydate) {
		super();
		this.cardnumber = cardnumber;
		this.holdername = holdername;
		this.pin = pin;
		this.expirydate = expirydate;
	}
	@Override
	public String toString() {
		return "ATMCard [cardnumber=" + cardnumber + ", holdername=" + holdername + ", pin=" + pin + ", expirydate="
				+ expirydate + "]";
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public String getHoldername() {
		return holdername;
	}
	public int getPin() {
		return pin;
	}
	public int getExpirydate() {
		return expirydate;
	}
	
}
