package com.techelevator.ShippingExercise;

public class SPUNextDay implements DeliveryDriver{

	public SPUNextDay() {
		// TODO Auto-generated constructor stub
	}


	public double calculateRate(int distance, double weight) {
		double rate = ((weight/16) * 0.075) * distance;
		return rate;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return "SPU Next Day";
	}

}
