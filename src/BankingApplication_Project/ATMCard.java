package BankingApplication_Project;

public class ATMCard {

	protected String cardnumber;
	protected String holdername;
	protected int pin;
	protected String linkedAccountNo;
	protected int expirydate;
	/**
	 * @param cardnumber
	 * @param holdername
	 * @param pin
	 * @param linkedAccountNo
	 * @param expirydate
	 */
	public ATMCard(String cardnumber, String holdername, int pin, String linkedAccountNo, int expirydate) {
		super();
		this.cardnumber = cardnumber;
		this.holdername = holdername;
		this.pin = pin;
		this.linkedAccountNo = linkedAccountNo;
		this.expirydate = expirydate;
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
	public String getLinkedAccountNo() {
		return linkedAccountNo;
	}
	public int getExpirydate() {
		return expirydate;
	}
	@Override
	public String toString() {
		return "ATMCard [cardnumber=" + cardnumber + ", holdername=" + holdername + ", pin=" + pin
				+ ", linkedAccountNo=" + linkedAccountNo + ", expirydate=" + expirydate + "]";
	}
	
	
}
