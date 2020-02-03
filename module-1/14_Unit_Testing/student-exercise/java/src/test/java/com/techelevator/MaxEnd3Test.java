package com.techelevator;

import org.junit.*;

public class MaxEnd3Test {
		
		MaxEnd3 test = new MaxEnd3();
		
		
		@Test
		public void TestLargestAtBeginning() {
			int[] nums = new int[] {12,5,9};
			int[] solution = new int[] {12,12,12};
			Assert.assertArrayEquals(solution, test.makeArray(nums));
		}
		@Test
		public void TestLargestAtEnd() {
			int[] nums = new int[] {1,5,9};
			int[] solution = new int[] {9,9,9};
			Assert.assertArrayEquals(solution, test.makeArray(nums));
		}
		@Test
		public void TestLargestAtMiddle() {
			int[] nums = new int[] {1,9,3};
			int[] solution = new int[] {3,3,3};
			Assert.assertArrayEquals(solution, test.makeArray(nums));
		}


}
