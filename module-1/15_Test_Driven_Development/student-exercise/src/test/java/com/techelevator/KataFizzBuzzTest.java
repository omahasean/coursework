package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	KataFizzBuzz fizzBuzz = new KataFizzBuzz();
	
	@Test
	public void TestFizzBuzzIfNumberIsDivisibleBy3() {
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzSpecial(3));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzSpecial(21));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzSpecial(99));
	}
	@Test
	public void TestFizzBuzzIfNumberDivisibleBy5() {
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzzSpecial(5));
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzzSpecial(25));
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzzSpecial(95));
	}
	@Test
	public void TestFizzBuzzIfNumberDivisibleBy3and5() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzzSpecial(15));
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzzSpecial(30));
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzzSpecial(90));
	}
	@Test
	public void TestIfNumbersBetween1And100NotFizzBuzz() {
		Assert.assertEquals("22", fizzBuzz.fizzBuzzSpecial(22));
		Assert.assertEquals("82", fizzBuzz.fizzBuzzSpecial(82));
		Assert.assertEquals("17", fizzBuzz.fizzBuzzSpecial(17));
	}

}
