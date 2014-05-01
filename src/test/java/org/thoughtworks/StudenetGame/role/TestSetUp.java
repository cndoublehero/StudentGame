package org.thoughtworks.StudenetGame.role;

import org.thoughtworks.StudenetGame.number.GameNumber;

public class TestSetUp {

	public static void setUp() {
		GameNumber.resetGameNumber();
		GameNumber.getAndSetFirstGameNumber(3);
		GameNumber.getAndSetSecondGameNumber(5);
		GameNumber.getAndSetThreeGameNumber(7);
	}
}
