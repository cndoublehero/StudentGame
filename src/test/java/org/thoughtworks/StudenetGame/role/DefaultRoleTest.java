package org.thoughtworks.StudenetGame.role;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultRoleTest {

	@Test
	public void testDefaultRole() {
		IRole role = DefaultRole.getDefaultRole();
		assertNull(role.apply(0));
	}
}
