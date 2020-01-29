package com.techelevator.ShippingExercise;

public class SPUFourDayGround implements DeliveryDriver{

	public SPUFourDayGround() {
		// TODO Auto-generated constructor stub
	}


	public double calculateRate(int distance, double weight) {
		double rate = ((weight/16) * 0.0050) * distance;
		return rate;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "SPU 4-Day Ground";
	}

}
