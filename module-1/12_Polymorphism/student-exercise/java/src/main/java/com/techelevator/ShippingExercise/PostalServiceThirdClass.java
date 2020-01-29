package com.techelevator.ShippingExercise;

public class PostalServiceThirdClass implements DeliveryDriver{

	public PostalServiceThirdClass() {
		// TODO Auto-generated constructor stub
	}

	
	public double calculateRate(int distance, double weight) {
		double perMileRate = 0;
		double totalCost = 0;
		if (weight <= 2) {
			perMileRate = .002;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 8) {
			perMileRate = .0022;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 15) {
			perMileRate = .0024;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 16) {
			perMileRate = .015;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 128) {
			perMileRate = .016;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else {
			perMileRate = .017;
			totalCost =  perMileRate * distance;
			return totalCost;
		}

	}

	
	public String getName() {
		
		return "Postal Service Third Class";
	}

}
