package org.thoughtworks.StudenetGame.role;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoleCollectionsTest {

	@Before
	public void setUp() {
		TestSetUp.setUp();
	}

	@Test
	public void shouldEachNumberCanChangeToCorrectWords() {
		assertEquals("Fizz", RoleCollections.apply(3));
		assertEquals("Fizz", RoleCollections.apply(3));
		assertEquals("Fizz", RoleCollections.apply(6));
		assertEquals("Fizz", RoleCollections.apply(9));
		assertEquals("Fizz", RoleCollections.apply(12));
		assertEquals("Fizz", RoleCollections.apply(30));
		assertTrue("Fizz".equals(RoleCollections.apply(13)));
		assertEquals("Buzz", RoleCollections.apply(5));
		assertEquals("Buzz", RoleCollections.apply(10));
		assertEquals("Buzz", RoleCollections.apply(20));
		assertEquals("Buzz", RoleCollections.apply(25));
		assertFalse("Buzz".equals(RoleCollections.apply(13)));
		assertEquals("Whizz", RoleCollections.apply(7));
		assertEquals("Whizz", RoleCollections.apply(14));
		assertEquals("Whizz", RoleCollections.apply(28));
		assertEquals("Whizz", RoleCollections.apply(49));
		assertFalse("Whizz".equals(RoleCollections.apply(13)));
		assertEquals("FizzBuzz", RoleCollections.apply(15));
		assertEquals("Fizz", RoleCollections.apply(30));
		assertEquals("FizzBuzz", RoleCollections.apply(45));
		assertEquals("FizzBuzz", RoleCollections.apply(90));
		assertEquals("FizzWhizz", RoleCollections.apply(21));
		assertEquals("Fizz", RoleCollections.apply(63));
		assertEquals("Fizz", RoleCollections.apply(35));
		assertEquals("FizzBuzzWhizz", RoleCollections.apply(105));
	}
}
