package com.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
		assertEquals(true, exception.getMessage().contains("Password cannot be empty or blank."));
	}

	@Test
	void shouldCheckPasswordForLowerCase() throws PasswordCheckException {
		Throwable exception = assertThrows(PasswordCheckException.class, () -> {
			PasswordValidator.isValidPassword("ADMIN@123453");
		});
		assertEquals(true, exception.getMessage().contains("Password should have at least one lowercase letter."));
	}

	@Test
	void shouldCheckPasswordIsValid() throws PasswordCheckException {
		assertTrue(PasswordValidator.isValidPassword("Admin@12345"));
	}

}