package org.thoughtworks.StudenetGame.role;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OneTimeMultipleRoleTest {
	@Before
	public void setUp() {
		TestSetUp.setUp();
	}

	@Test
	public void shouldThreeMultipleOneTimeToCorrectWords() {
		IRole role = OneTimeMultipleRole.getOneTimeMultipleRoleInstance();
		assertEquals("Fizz", role.apply(3));
		assertEquals("Fizz", role.apply(6));
		assertEquals("Fizz", role.apply(9));
		assertEquals("Fizz", role.apply(12));
		assertEquals("Fizz", role.apply(30));
		assertFalse("Fizz".equals(role.apply(13)));
	}

	@Test
	public void shouldFiveMultipleOneTimeToCorrectWords() {
		IRole role = OneTimeMultipleRole.getOneTimeMultipleRoleInstance();
		assertEquals("Buzz", role.apply(5));
		assertEquals("Buzz", role.apply(10));
		assertEquals("Buzz", role.apply(20));
		assertEquals("Buzz", role.apply(25));
		assertFalse("Buzz".equals(role.apply(13)));
	}

	@Test
	public void shouldSevenMultipleOneTimeToCorrectWords() {
		IRole role = OneTimeMultipleRole.getOneTimeMultipleRoleInstance();
		assertEquals("Whizz", role.apply(7));
		assertEquals("Whizz", role.apply(14));
		assertEquals("Whizz", role.apply(28));
		assertEquals("Whizz", role.apply(49));
		assertFalse("Whizz".equals(role.apply(13)));
	}
}
