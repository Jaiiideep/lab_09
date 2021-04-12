package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;


public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addStrings("One", "Two");
		assertEquals("OneTwo", result);
		
		String failResult = junitstring.addStrings("One", "Two");
		assertEquals("OneTwox", result);
	}

}
