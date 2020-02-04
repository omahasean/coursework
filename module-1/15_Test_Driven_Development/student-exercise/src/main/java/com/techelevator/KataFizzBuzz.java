package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzzSpecial(int n) {
		if(n%3==0) {
			return "Fizz";
		}
		else if (n%5==0) {
			return "Buzz";
		}
		return "";
	}

}
