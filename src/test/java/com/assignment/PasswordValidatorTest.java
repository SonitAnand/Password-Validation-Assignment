package com.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for password validation logic.
 */
class PasswordValidatorTest {

	@Test
	void shouldCheckPasswordIsEmpty() throws Exception {
		Throwable exception = assertThrows(Exception.class, () -> {
			PasswordValidator.isValidPassword("");
		});
		assertEquals("Password cannot be empty or blank.", exception.getMessage());
	}

}