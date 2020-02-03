package com.techelevator;

import org.junit.*;

public class SameFirstLastTest {
	
	SameFirstLast test = new SameFirstLast();
	
	
	@Test
	public void TestSameFirstLastTrue() {
		int [] nums = new int[] {1,2,6,3,1};
		int [] nums2 = new int[] {9,2,6,3,9};
		Assert.assertTrue(test.isItTheSame(nums));
		Assert.assertTrue(test.isItTheSame(nums2));
	}
	@Test
	public void TestSameFirstLastFalse() {
		int [] nums = new int[] {1,2,6,3,9};
		int [] nums2 = new int[] {9,2,6,3,1};
		Assert.assertFalse(test.isItTheSame(nums));
		Assert.assertFalse(test.isItTheSame(nums2));
	}
	@Test
	public void TestArrayLengthOne() {
		int [] nums = new int[] {1};
		int [] nums2 = new int[] {9};
		Assert.assertTrue(test.isItTheSame(nums));
		Assert.assertTrue(test.isItTheSame(nums2));
	}

}
