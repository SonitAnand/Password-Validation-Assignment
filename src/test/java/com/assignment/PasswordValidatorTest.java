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

	@Test
	void shouldCheckPasswordForLength() throws Exception {
		Throwable exception = assertThrows(Exception.class, () -> {
			PasswordValidator.isValidPassword("admin@1");
		});
		assertEquals("Password length should be larger than 8 chars.", exception.getMessage());
	}

	@Test
	void shouldCheckPasswordForUpperCase() throws Exception {
		Throwable exception = assertThrows(Exception.class, () -> {
			PasswordValidator.isValidPassword("admin@12345");
		});
		assertEquals("Password should have at least one uppercase letter.", exception.getMessage());
	}

}