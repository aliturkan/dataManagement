package com.bank.alit.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class AccessDeniedException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccessDeniedException(String message) {
		super(message);
	}
}
























