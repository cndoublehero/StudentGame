package org.thoughtworks.StudenetGame.role;

import org.junit.Test;
import org.thoughtworks.StudenetGame.handler.DefaultHandler;
import org.thoughtworks.StudenetGame.number.GameNumber;

import static org.junit.Assert.*;

public class DefaultHandlerTest {
	@Test
	public void shoudInputThreeCorrectWordsReturnTrue() {
		assertTrue(DefaultHandler.getDefaultHandlerInstance().handle("3,5,7"));
		assertNotNull(GameNumber.FirstGameNumber);
		assertNotNull(GameNumber.SecondGameNumber);
		assertNotNull(GameNumber.ThreeGameNumber);
	}

	@Test
	public void shoudInputThreeCorrectContainSpaceWordsReturnTrue() {
		assertTrue(DefaultHandler.getDefaultHandlerInstance().handle("3, 5, 7"));
		assertNotNull(GameNumber.FirstGameNumber);
		assertNotNull(GameNumber.SecondGameNumber);
		assertNotNull(GameNumber.ThreeGameNumber);
	}

	@Test
	public void shoudInputOneOrTwoWordsReturnFalse() {
		assertFalse(DefaultHandler.getDefaultHandlerInstance().handle("3,5"));
		assertFalse(DefaultHandler.getDefaultHandlerInstance().handle("3"));
		assertFalse(DefaultHandler.getDefaultHandlerInstance().handle("3,a"));
		assertFalse(DefaultHandler.getDefaultHandlerInstance().handle("b,c"));
	}

	@Test
	public void shoudWrongMsgReturnFalse() {
		assertFalse(DefaultHandler.getDefaultHandlerInstance().handle("sdds"));
		assertFalse(DefaultHandler.getDefaultHandlerInstance()
				.handle("3dssdds"));
	}
}
