package com.techelevator;

import org.junit.*;

public class Less20Test {

	Less20 isUnder20 = new Less20();
	
	@Test
	public void Less20TestTrue() {
		Assert.assertTrue(isUnder20.isLessThanMultipleOf20(18));
		Assert.assertTrue(isUnder20.isLessThanMultipleOf20(19));
		Assert.assertTrue(isUnder20.isLessThanMultipleOf20(39));
		Assert.assertTrue(isUnder20.isLessThanMultipleOf20(38));
		Assert.assertTrue(isUnder20.isLessThanMultipleOf20(59));
		Assert.assertTrue(isUnder20.isLessThanMultipleOf20(58));
	}
	@Test
	public void Less20TestFalse() {
		Assert.assertFalse(isUnder20.isLessThanMultipleOf20(16));
		Assert.assertFalse(isUnder20.isLessThanMultipleOf20(6));
		Assert.assertFalse(isUnder20.isLessThanMultipleOf20(100));
		Assert.assertFalse(isUnder20.isLessThanMultipleOf20(20));
	}

}
