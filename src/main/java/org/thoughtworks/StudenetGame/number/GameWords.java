package org.thoughtworks.StudenetGame.number;

public enum GameWords {
	Fizz("Fizz"), Buzz("Buzz"), Whizz("Whizz");
	private final String name;

	GameWords(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
