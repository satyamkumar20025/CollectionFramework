package BankingApplication_Project;

import java.time.LocalDateTime;

public class KYC {

	protected String KYCID;
	protected String CustomerId;
	protected String douType;
	protected String docNumber;
	protected String issueDate;
	protected String expiredate;
	protected String status;
	/**
	 * @param kYCID
	 * @param customerId
	 * @param douType
	 * @param docNumber
	 * @param issueDate
	 * @param expiredate
	 * @param status
	 */
	public KYC(String kYCID, String customerId, String douType, String docNumber, String issueDate, String expiredate,
			String status) {
		super();
		KYCID = kYCID;
		CustomerId = customerId;
		this.douType = douType;
		this.docNumber = docNumber;
		this.issueDate = issueDate;
		this.expiredate = expiredate;
		this.status = status;
	}
	@Override
	public String toString() {
		return "KYC [KYCID=" + KYCID + ", CustomerId=" + CustomerId + ", douType=" + douType + ", docNumber="
				+ docNumber + ", issueDate=" + issueDate + ", expiredate=" + expiredate + ", status=" + status + "]";
	}
	public String getKYCID() {
		return KYCID;
	}
	public void setKYCID(String kYCID) {
		KYCID = kYCID;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getDouType() {
		return douType;
	}
	public void setDouType(String douType) {
		this.douType = douType;
	}
	public String getDocNumber() {
		return docNumber;
	}
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiredate() {
		return expiredate;
	}
	public void setExpiredate(String expiredate) {
		this.expiredate = expiredate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}