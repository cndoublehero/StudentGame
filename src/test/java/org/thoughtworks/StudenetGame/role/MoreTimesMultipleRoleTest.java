package org.thoughtworks.StudenetGame.role;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoreTimesMultipleRoleTest {
	@Before
	public void setUp() {
		TestSetUp.setUp();
	}

	@Test
	public void shouldTwoTimesMultipleToCorrectWords() {
		IRole role = MoreTimesMultipleRole
				.getMoreTimesMultipleRoleInstance();
		assertEquals("FizzBuzz", role.apply(15));
		assertEquals("FizzBuzz", role.apply(30));
		assertEquals("FizzBuzz", role.apply(45));
		assertEquals("FizzBuzz", role.apply(90));
		assertEquals("FizzWhizz", role.apply(21));
		assertEquals("FizzWhizz", role.apply(63));
		assertEquals("BuzzWhizz", role.apply(35));
	}

	@Test
	public void shoudThreeTimesMultipleToCorrectWords() {
		IRole role = MoreTimesMultipleRole
				.getMoreTimesMultipleRoleInstance();
		assertEquals("FizzBuzzWhizz", role.apply(105));
	}
}
