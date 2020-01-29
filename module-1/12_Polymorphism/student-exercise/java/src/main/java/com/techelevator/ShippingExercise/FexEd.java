package com.techelevator.ShippingExercise;

public class FexEd implements DeliveryDriver {

	public FexEd() {

	}


	public double calculateRate(int distance, double weight) {
		double rate = 20.00;
		double distanceFeeRate = rate + 5.00;
		double weightFeeRate = rate + 2.00;
		double bothFeeRate = rate + 7.00;
		if (distance > 500 && weight > 48) {
			return bothFeeRate;
		}
		else if (distance > 500) {
			return distanceFeeRate;
		}
		else if (weight > 48) {
			return weightFeeRate;
		}
		else {
			return rate;
		}
		
	}
	

	@Override
	public String getName() {
		return "FexEd";
	}

}
