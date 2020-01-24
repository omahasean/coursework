package com.techelevator.calculator;

import java.math.*;
public class Calculator {

	private int result = 0;

	public int getResult() {
		return result;
	}
	
	public int add(int addend) {
		return result = result + addend;
	}
	public int multiply(int multiplier) {
		return result = result*multiplier;
	}
	public int power(int exponent) {
		int newSum=result;
		for (int i = 1; i<exponent; i++) {
			result*=newSum;
		}
//		result = (int) Math.pow();
		return result;
	}
	public void reset() {
		result=0;
	}
	public int subtract(int subtrahend) {
		return result = result - subtrahend;
	}
}
