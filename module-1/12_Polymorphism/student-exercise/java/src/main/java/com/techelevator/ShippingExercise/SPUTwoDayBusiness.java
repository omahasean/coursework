package com.techelevator.ShippingExercise;

public class SPUTwoDayBusiness implements DeliveryDriver {

	public SPUTwoDayBusiness() {
		// TODO Auto-generated constructor stub
	}

	
	public double calculateRate(int distance, double weight) {
		double rate = ((weight/16) * 0.050) * distance;
		return rate;
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return "SPU 2-Day Business";
	}

}
