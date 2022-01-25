package com.empapp.model.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 7880715994507674980L;
	 
    public EmployeeNotFoundException(String message) {
        super(message);
    }

}
