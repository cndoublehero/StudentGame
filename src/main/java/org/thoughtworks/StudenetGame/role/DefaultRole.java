package org.thoughtworks.StudenetGame.role;

public class DefaultRole implements IRole {
	private final static IRole defaultRole = new DefaultRole();

	private DefaultRole() {

	}

	public static IRole getDefaultRole() {
		return defaultRole;
	}

	@Override
	public String apply(int number) {
		return null;
	}

}
