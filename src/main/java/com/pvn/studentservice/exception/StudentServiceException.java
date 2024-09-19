package com.pvn.studentservice.exception;

public class StudentServiceException extends Exception {
	private int statusCode;

	public StudentServiceException(int statusCode,String message) {
		super(message);
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	
	
	

}
