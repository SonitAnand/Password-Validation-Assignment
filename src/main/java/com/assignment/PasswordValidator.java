package com.assignment;

/**
 * Main method for password validations.
 */
public class PasswordValidator {

	// created constants for generic password validation messages
	private static final String PASSWORD_SHOULD_HAVE_ONE_NUMBER_AT_LEAST = "Password should have one number at least.";
	private static final String PASSWORD_SHOULD_HAVE_AT_LEAST_ONE_LOWERCASE_LETTER = "Password should have at least one lowercase letter.";
	private static final String PASSWORD_SHOULD_HAVE_AT_LEAST_ONE_UPPERCASE_LETTER = "Password should have at least one uppercase letter.";
	private static final String PASSWORD_LENGTH_SHOULD_BE_LARGER_THAN_8_CHARS = "Password length should be larger than 8 chars.";
	private static final String PASSWORD_CANNOT_BE_EMPTY_OR_BLANK = "Password cannot be empty or blank.";

	public static void main(String[] args) throws PasswordCheckException {

		isValidPassword("Admin@12345");

	}

	/**
	 * Checks if is valid password.
	 *
	 * @param password the password
	 * @throws RuntimeException the runtime exception
	 */
	public static void isValidPassword(String password) throws PasswordCheckException {
		// check for password should not be null
		if (password.equals("") || password.length() == 0)
			throw new PasswordCheckException(PASSWORD_CANNOT_BE_EMPTY_OR_BLANK);

		// check for password should be larger than 8 chars
		if (password.length() <= 8)
			throw new PasswordCheckException(PASSWORD_LENGTH_SHOULD_BE_LARGER_THAN_8_CHARS);

		// check for password should have one uppercase letter at least
		if (!password.matches(".*[A-Z].*"))
			throw new PasswordCheckException(PASSWORD_SHOULD_HAVE_AT_LEAST_ONE_UPPERCASE_LETTER);

		// check for password should have one lowercase letter at least
		if (!password.matches(".*[a-z].*"))
			throw new PasswordCheckException(PASSWORD_SHOULD_HAVE_AT_LEAST_ONE_LOWERCASE_LETTER);

		// check for password should have one number at least
		if (!password.matches(".*[0-9].*"))
			throw new PasswordCheckException(PASSWORD_SHOULD_HAVE_ONE_NUMBER_AT_LEAST);
	}
}
