package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	public void test() {
		jUnitFunction junitstring=new jUnitFunction();
		String result = junitstring.addStrings("successful","project");
		assertEquals ("successfulproject", result);
	}

}
