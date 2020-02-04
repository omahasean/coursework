package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	KataFizzBuzz fizzBuzz = new KataFizzBuzz();
	
	@Test
	public void FizzBuzzIfNumberIsDivisibleBy3() {
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzSpecial(3));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzSpecial(21));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzSpecial(99));
	}

}
