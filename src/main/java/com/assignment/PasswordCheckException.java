package com.assignment;

/**
 * Custom class for exception.
 */
public class PasswordCheckException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -572444533564569820L;

	/**
	 * Instantiates a new password check exception.
	 *
	 * @param errorMessage the error message
	 */
	public PasswordCheckException(String errorMessage) {
		super(errorMessage);
	}

}
