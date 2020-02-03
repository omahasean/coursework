package com.techelevator;

import java.lang.reflect.Array;

import org.junit.*;

public class Lucky13Test {
	Lucky13 test = new Lucky13();
	
	@Test
	public void TestNo1or3() {
		int[] nums = new int[] {2,4,6,5,2};
		Assert.assertTrue(test.getLucky(nums));
	}
	@Test
	public void Test1sInNums() {
		int[] nums = new int[] {2,4,1,5,2};
		Assert.assertFalse(test.getLucky(nums));
	}
	@Test
	public void Test3sInNums() {
		int[] nums = new int[] {2,4,6,3,2};
		Assert.assertFalse(test.getLucky(nums));
	}
	

}
