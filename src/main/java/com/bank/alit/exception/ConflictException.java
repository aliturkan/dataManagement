package com.bank.alit.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ConflictException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConflictException(String message) {
		super(message);
	}
}
