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

}
