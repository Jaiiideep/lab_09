package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumbers(10, 20);
		assertEquals(30, result);
		
		int failResult = junit.addNumbers(10, 20);
		assertEquals(31, result);
	}

}
