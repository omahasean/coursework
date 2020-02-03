package com.techelevator;

import org.junit.*;

public class DateFashionTest {
	
	DateFashion date;
	
	@Before
	public void newDate() {
		date = new DateFashion();
	}
	
	@Test
	public void noTableTest() {
		Assert.assertEquals(0, date.getATable(5, 2));
		Assert.assertEquals(0, date.getATable(2, 2));
		Assert.assertEquals(0, date.getATable(10, 2));
		Assert.assertEquals(0, date.getATable(8, 1));
	}
	@Test
	public void getTableTest() {
		Assert.assertEquals(2, date.getATable(5, 10));
		Assert.assertEquals(2, date.getATable(6, 10));
		Assert.assertEquals(2, date.getATable(10, 4));
		Assert.assertEquals(2, date.getATable(8, 5));
	}
	@Test
	public void maybleTableTest() {
		Assert.assertEquals(1, date.getATable(5, 5));
		Assert.assertEquals(1, date.getATable(5, 3));
		Assert.assertEquals(1, date.getATable(6, 3));
		Assert.assertEquals(1, date.getATable(6, 4));
	}
}
