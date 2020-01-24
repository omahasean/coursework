package com.techelevator.dog;

public class Dog {

	private boolean isSleeping;

	public boolean isSleeping() {
		return isSleeping;
	}
	
	public String makeSound() {
		if (isSleeping==false) {
			return "Woof!";
		}
		else {
			return "Zzzzz...";
		}
	}
	public void sleep() {
		isSleeping=true;
	}
	public void wakeUp() {
		isSleeping=false;
	}
	
}
