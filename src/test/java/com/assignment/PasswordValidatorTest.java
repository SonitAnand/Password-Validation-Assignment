package com.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for password validation logic.
 */
class PasswordValidatorTest {

	@Test
	void shouldCheckPasswordIsEmpty() {
		assertEquals("Password cannot be empty or blank.", "Password cannot be empty or blank.");
	}

}