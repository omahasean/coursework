package com.techelevator;

import org.junit.*;
public class StringBitsTest {

	StringBits test = new StringBits();
	
	@Test
	public void StringBitsTest() {
		String a = "Hello";
		String b = "Coding";
		Assert.assertEquals("Hlo", test.getBits(a));
		Assert.assertEquals("Cdn", test.getBits(b));
	}
	
	@Test
	public void StringTestEmptyAndNull() {
		String a = "";
		String b = null;
		Assert.assertEquals("", test.getBits(a));
		Assert.assertEquals("", test.getBits(b));

	}

}
