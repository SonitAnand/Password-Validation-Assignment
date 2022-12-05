package com.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for password validation logic.
 */
class PasswordValidatorTest {

	@Test
	void shouldCheckPasswordIsEmpty() throws PasswordCheckException {
		Throwable exception = assertThrows(PasswordCheckException.class, () -> {
			PasswordValidator.isValidPassword("");
		});
		assertEquals("Password cannot be empty or blank.", exception.getMessage());
	}

	@Test
	void shouldCheckPasswordForLength() throws PasswordCheckException {
		Throwable exception = assertThrows(PasswordCheckException.class, () -> {
			PasswordValidator.isValidPassword("admin@1");
		});
		assertEquals("Password length should be larger than 8 chars.", exception.getMessage());
	}

	@Test
	void shouldCheckPasswordForUpperCase() throws PasswordCheckException {
		Throwable exception = assertThrows(PasswordCheckException.class, () -> {
			PasswordValidator.isValidPassword("admin@12345");
		});
		assertEquals("Password should have at least one uppercase letter.", exception.getMessage());
	}

	@Test
	void shouldCheckPasswordForLowerCase() throws PasswordCheckException {
		Throwable exception = assertThrows(PasswordCheckException.class, () -> {
			PasswordValidator.isValidPassword("ADMIN@123453");
		});
		assertEquals("Password should have at least one lowercase letter.", exception.getMessage());
	}

	@Test
	void shouldCheckPasswordForOneNumber() throws PasswordCheckException {
		Throwable exception = assertThrows(PasswordCheckException.class, () -> {
			PasswordValidator.isValidPassword("ADMIN@admin");
		});
		assertEquals("Password should have one number at least.", exception.getMessage());
	}

}