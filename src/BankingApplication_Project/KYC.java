package BankingApplication_Project;

import java.time.LocalDateTime;

public class KYC {

	private String KYCID;
	private String CustomerId;
	private String douType;
	private String docNumber;
	private LocalDateTime issueDate;
	private LocalDateTime expiredate;
	private String status;
	/**
	 * @param kYCID
	 * @param customerId
	 * @param douType
	 * @param docNumber
	 * @param issueDate
	 * @param expiredate
	 * @param status
	 */
	public KYC(String kYCID, String customerId, String douType, String docNumber, LocalDateTime issueDate,
			LocalDateTime expiredate, String status) {
		super();
		KYCID = kYCID;
		CustomerId = customerId;
		this.douType = douType;
		this.docNumber = docNumber;
		this.issueDate = issueDate;
		this.expiredate = expiredate;
		this.status = status;
	}
	public String getKYCID() {
		return KYCID;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public String getDouType() {
		return douType;
	}
	public String getDocNumber() {
		return docNumber;
	}
	public LocalDateTime getIssueDate() {
		return issueDate;
	}
	public LocalDateTime getExpiredate() {
		return expiredate;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "KYC [KYCID=" + KYCID + ", CustomerId=" + CustomerId + ", douType=" + douType + ", docNumber="
				+ docNumber + ", issueDate=" + issueDate + ", expiredate=" + expiredate + ", status=" + status + "]";
	}
	
	
}
