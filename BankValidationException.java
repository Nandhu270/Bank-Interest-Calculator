package com.wipro.bank.exception;

public class BankValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	public BankValidationException() {
		super();
	}

	public BankValidationException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "Invalid Data : " + getMessage();
	}

}
