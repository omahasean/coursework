package com.techelevator.ShippingExercise;

public class PostalServiceFirstClass implements DeliveryDriver {

	public PostalServiceFirstClass() {
		// TODO Auto-generated constructor stub
	}


	public double calculateRate(int distance, double weight) {
		double perMileRate = 0;
		double totalCost = 0;
		if (weight <= 2) {
			perMileRate = .035;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 8) {
			perMileRate = .04;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 15) {
			perMileRate = .047;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 16) {
			perMileRate = .195;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else if (weight <= 128) {
			perMileRate = .45;
			totalCost =  perMileRate * distance;
			return totalCost;
		}
		else {
			perMileRate = .5;
			totalCost =  perMileRate * distance;
			return totalCost;
		}

	}

	
	public String getName() {
		
		return "Postal Service First Class";
	}

}
