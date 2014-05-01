package org.thoughtworks.StudenetGame.role;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainFirstNumberRoleTest {
	@Before
	public void setUp() {
		TestSetUp.setUp();
	}

	@Test
	public void shoudContainFirestNumberToCorrectWords() {
		IRole role = ContainFirstNumberRole.getContainFirstNumberRoleInstance();
		assertEquals("Fizz", role.apply(3));
		assertEquals("Fizz", role.apply(35));
	}
}
