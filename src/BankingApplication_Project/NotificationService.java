package BankingApplication_Project;

public class NotificationService {
	

	    public void sendSuccess(String message) {
	        System.out.println("  SUCCESS : " + message);
	    }

	    public void sendError(String message) {
	        System.out.println("  ERROR : " + message);
	    }

	    public void sendWarning(String message) {
	        System.out.println(" WARNING : " + message);
	    }
	}

