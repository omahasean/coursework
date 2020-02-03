package com.techelevator;

import org.junit.*;

public class NonStartTest {
	
	NonStart test = new NonStart();
	
	@Test
	public void TestNonStart() {
		String a = "java";
		String b = "mojo";
		Assert.assertEquals("avaojo", test.getPartialString(a, b));
		
	}
	@Test
	public void TestSingleLetterString() {
		String a = "a";
		String b = "b";
		Assert.assertEquals("", test.getPartialString(a, b));
	}

}
