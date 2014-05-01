package org.thoughtworks.StudenetGame.number;

public class GameNumber {
	private final int value;
	private final GameWords gameWords;
	public static GameNumber FirstGameNumber;
	public static GameNumber SecondGameNumber;
	public static GameNumber ThreeGameNumber;

	private GameNumber(int value, int position) {
		if (value == 0) {
			throw new RuntimeException("cannot have a zero sepecial number");
		}
		this.value = value;
		this.gameWords = GameWords.values()[position];
	}

	public static GameNumber getAndSetFirstGameNumber(int value) {
		if (FirstGameNumber == null) {
			FirstGameNumber = new GameNumber(value, 0);
		}
		return FirstGameNumber;
	}

	public static GameNumber getAndSetSecondGameNumber(int value) {
		if (SecondGameNumber == null) {
			SecondGameNumber = new GameNumber(value, 1);
		}
		return SecondGameNumber;
	}

	public static GameNumber getAndSetThreeGameNumber(int value) {
		if (ThreeGameNumber == null) {
			ThreeGameNumber = new GameNumber(value, 2);
		}
		return ThreeGameNumber;
	}

	public boolean isDivisibleBy(int number) {
		return number % value == 0;
	}

	public static void resetGameNumber() {
		FirstGameNumber = null;
		SecondGameNumber = null;
		ThreeGameNumber = null;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return gameWords.getName();
	}
}
