package org.thoughtworks.StudenetGame.role;

public enum RoleCollections {
	containFirstNumberRole(ContainFirstNumberRole
			.getContainFirstNumberRoleInstance()), moreTimesMultipleRole(
			MoreTimesMultipleRole.getMoreTimesMultipleRoleInstance()), oneTimeMultipleRole(
			OneTimeMultipleRole.getOneTimeMultipleRoleInstance());
	private final IRole role;

	RoleCollections(IRole role) {
		this.role = role;
	}

	public IRole getRole() {
		return role;
	}

	public static String apply(int value) {
		String result = null;
		for (RoleCollections role : RoleCollections.values()) {
			result = role.getRole().apply(value);
			if (result != null) {
				return result;
			}
		}
		return String.valueOf(value);
	}
}
