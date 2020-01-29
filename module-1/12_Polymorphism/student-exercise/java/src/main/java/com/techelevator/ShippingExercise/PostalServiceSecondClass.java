package com.techelevator.ShippingExercise;

public class PostalServiceSecondClass implements DeliveryDriver {

	public PostalServiceSecondClass() {
		// TODO Auto-generated constructor stub
	}


	public double calculateRate(int distance, double weight) {
		double perMileRate = 0;
		double totalCost = 0;
		if (weight <= 2) {
			perMileRate = .0035;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 8) {
			perMileRate = .004;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 15) {
			perMileRate = .0047;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 16) {
			perMileRate = .0195;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 128) {
			perMileRate = .045;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else {
			perMileRate = .05;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
	}


	public String getName() {
		// TODO Auto-generated method stub
		return "Postal Service Second Class";
	}

}
