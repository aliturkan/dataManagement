package com.bank.alit.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class BalanceNotAvailableException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BalanceNotAvailableException(String message) {
		super(message);
	}
}
























