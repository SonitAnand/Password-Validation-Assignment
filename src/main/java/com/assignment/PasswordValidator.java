package com.assignment;

/**
 * Main method for password validations.
 */
public class PasswordValidator {

	public static void main(String[] args) {

		isValidPassword("Admin@12345");

	}

	/**
	 * Checks if is valid password.
	 *
	 * @param password the password
	 * @throws RuntimeException the runtime exception
	 */
	public static void isValidPassword(String password) throws RuntimeException {
		// check for password should not be null
		if (password.equals("") || password.length() == 0)
			throw new RuntimeException("Password cannot be empty or blank.");

		// check for password should be larger than 8 chars
		if (password.length() <= 8)
			throw new RuntimeException("Password length should be larger than 8 chars.");

		// check for password should have one uppercase letter at least
		if (!password.matches(".*[A-Z].*"))
			throw new RuntimeException("Password should have at least one uppercase letter.");

		// check for password should have one lowercase letter at least
		if (!password.matches(".*[a-z].*"))
			throw new RuntimeException("Password should have at least one lowercase letter.");
	}
}
