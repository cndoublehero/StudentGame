package org.thoughtworks.StudenetGame.number;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameNumberTest {

	@Test
	public void testGetAndSetFirstGameNumber() {
		GameNumber firstGameName = GameNumber.getAndSetFirstGameNumber(12);
		assertEquals(GameWords.values()[0].getName(), firstGameName.getName());
		assertEquals(12, firstGameName.getValue());
	}

	@Test
	public void testGetAndSetSecondGameNumber() {
		GameNumber secondGameNumber = GameNumber.getAndSetSecondGameNumber(12);
		assertEquals(GameWords.values()[1].getName(),
				secondGameNumber.getName());
		assertEquals(12, secondGameNumber.getValue());
	}

	@Test
	public void testGetAndSetThreeGameNumber() {
		GameNumber threeGameNumber = GameNumber.getAndSetThreeGameNumber(12);
		assertEquals(GameWords.values()[2].getName(), threeGameNumber.getName());
		assertEquals(12, threeGameNumber.getValue());
	}

	@Test
	public void testResetGameNumber() {
		GameNumber.getAndSetFirstGameNumber(12);
		GameNumber.getAndSetSecondGameNumber(12);
		GameNumber.getAndSetThreeGameNumber(12);
		assertNotNull(GameNumber.FirstGameNumber);
		assertNotNull(GameNumber.SecondGameNumber);
		assertNotNull(GameNumber.ThreeGameNumber);
		GameNumber.resetGameNumber();
		assertNull(GameNumber.FirstGameNumber);
		assertNull(GameNumber.SecondGameNumber);
		assertNull(GameNumber.ThreeGameNumber);
	}
}
