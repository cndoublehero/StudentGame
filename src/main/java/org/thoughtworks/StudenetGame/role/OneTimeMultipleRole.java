package org.thoughtworks.StudenetGame.role;

import org.thoughtworks.StudenetGame.number.GameNumber;

public class OneTimeMultipleRole implements IRole {
	private final static IRole oneTimeMultipleRole = new OneTimeMultipleRole();

	private OneTimeMultipleRole() {

	}

	public final static IRole getOneTimeMultipleRoleInstance() {
		return oneTimeMultipleRole;
	}

	@Override
	public String apply(int number) {
		GameNumber firstGameNumber = GameNumber.FirstGameNumber;
		if (firstGameNumber != null) {
			if (firstGameNumber.isDivisibleBy(number)) {
				return firstGameNumber.getName();
			}
		}
		GameNumber secondGameNumber = GameNumber.SecondGameNumber;
		if (secondGameNumber != null) {
			if (secondGameNumber.isDivisibleBy(number)) {
				return secondGameNumber.getName();
			}
		}
		GameNumber threeGameNumber = GameNumber.ThreeGameNumber;
		if (threeGameNumber != null) {
			if (threeGameNumber.isDivisibleBy(number)) {
				return threeGameNumber.getName();
			}
		}
		return null;
	}

}
