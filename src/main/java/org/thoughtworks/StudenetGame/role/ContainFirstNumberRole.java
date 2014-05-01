package org.thoughtworks.StudenetGame.role;

import org.thoughtworks.StudenetGame.number.GameNumber;

public class ContainFirstNumberRole implements IRole {
	private final static IRole containFirstNumberRole = new ContainFirstNumberRole();

	private ContainFirstNumberRole() {

	}

	public static IRole getContainFirstNumberRoleInstance() {
		return containFirstNumberRole;
	}

	@Override
	public String apply(int number) {
		GameNumber firstGameNumber = GameNumber.FirstGameNumber;
		if (firstGameNumber != null) {
			int digitalNumber = 0;
			int firstNumberValue = firstGameNumber.getValue();
			while (number > 10) {
				digitalNumber = number / 10;
				if (digitalNumber == firstNumberValue) {
					return firstGameNumber.getName();
				}
				number = number % 10;
			}

			if (number == firstNumberValue) {
				return firstGameNumber.getName();
			}
		}
		return null;
	}

}
