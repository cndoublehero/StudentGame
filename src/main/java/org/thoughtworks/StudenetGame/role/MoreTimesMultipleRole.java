package org.thoughtworks.StudenetGame.role;

import org.thoughtworks.StudenetGame.number.GameNumber;

public class MoreTimesMultipleRole implements IRole {
	private final static IRole moreTimesMultipleRole = new MoreTimesMultipleRole();

	private MoreTimesMultipleRole() {

	}

	public static IRole getMoreTimesMultipleRoleInstance() {
		return moreTimesMultipleRole;
	}

	@Override
	public String apply(int number) {
		StringBuilder sb = new StringBuilder();
		GameNumber firstGameNumber = GameNumber.FirstGameNumber;
		if (firstGameNumber != null) {
			if (firstGameNumber.isDivisibleBy(number)) {
				sb.append(firstGameNumber.getName());
			}
		}
		GameNumber secondGameNumber = GameNumber.SecondGameNumber;
		if (secondGameNumber != null) {
			if (secondGameNumber.isDivisibleBy(number)) {
				sb.append(secondGameNumber.getName());
			}
		}
		GameNumber threeGameNumber = GameNumber.ThreeGameNumber;
		if (threeGameNumber != null) {
			if (threeGameNumber.isDivisibleBy(number)) {
				sb.append(threeGameNumber.getName());
			}
		}
		if (sb.length() != 0) {
			return sb.toString();
		}
		return null;
	}

}
