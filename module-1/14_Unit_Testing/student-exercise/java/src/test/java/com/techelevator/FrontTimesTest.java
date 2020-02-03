package com.techelevator;

import org.junit.*;

public class FrontTimesTest {
	
	FrontTimes newFront = new FrontTimes();
	
	@Test
	public void FrontTimesTestStringGreaterThanThree() {
		Assert.assertEquals("ChoChoCho", newFront.generateString("Chocolate", 3));
		Assert.assertEquals("ChoCho", newFront.generateString("Chocolate", 2));
		Assert.assertEquals("AbcAbc", newFront.generateString("Abc", 2));
	}
	@Test
	public void FrontTimesTestStringLessThanThree() {
		Assert.assertEquals("AbAb", newFront.generateString("Ab", 2));
		Assert.assertEquals("AbAbAb", newFront.generateString("Ab", 3));
	}

}
