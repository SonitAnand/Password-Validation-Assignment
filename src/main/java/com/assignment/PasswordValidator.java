package com.assignment;

import java.util.ArrayList;
import java.util.List;

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

		List<String> errorList = new ArrayList<>();

		// check for password should not be null
		if (password.equals("") || password.length() == 0)
			errorList.add(PASSWORD_CANNOT_BE_EMPTY_OR_BLANK);

		// check for password should be larger than 8 chars
		if (password.length() <= 8)
			errorList.add(PASSWORD_LENGTH_SHOULD_BE_LARGER_THAN_8_CHARS);

		// check for password should have one uppercase letter at least
		if (!password.matches(".*[A-Z].*"))
			errorList.add(PASSWORD_SHOULD_HAVE_AT_LEAST_ONE_UPPERCASE_LETTER);

		// check for password should have one lowercase letter at least
		if (!password.matches(".*[a-z].*"))
			errorList.add(PASSWORD_SHOULD_HAVE_AT_LEAST_ONE_LOWERCASE_LETTER);

		// check for password should have one number at least
		if (!password.matches(".*[0-9].*"))
			errorList.add(PASSWORD_SHOULD_HAVE_ONE_NUMBER_AT_LEAST);

		// Validating for password is OK if at least three of the previous conditions is true and password is never OK if item 1.d is not true.
		if (errorList.size() > 2 || !password.matches(".*[a-z].*")) {
			throw new PasswordCheckException(errorList.toString());
		}
	}
}
