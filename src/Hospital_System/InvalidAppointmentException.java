package Hospital_System;

public record InvalidAppointmentException() extends Exception {
	 public InvalidAppointmentException(String message) {
	        super(message);
	    }


	}