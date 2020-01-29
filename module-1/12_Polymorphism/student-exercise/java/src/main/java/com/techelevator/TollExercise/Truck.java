package com.techelevator.TollExercise;

public class Truck implements Vehicle{
	int numberOfAxles;
	double ratePerMile;
	
	public Truck(int numberOfAxles) {
		this.numberOfAxles=numberOfAxles;
		if(numberOfAxles==4) {
			this.ratePerMile= .040;
		}
		else if(numberOfAxles==6) {
			this.ratePerMile= .045;
			}
		else {
			this.ratePerMile = .048;
		}
	}


	public double calculateToll(int distance) {
		double toll = distance * ratePerMile;
		return toll;
	}


	@Override
	public String getType() {
		if(numberOfAxles==4) {
			return "Truck with 4 Axles";
		}
		else if(numberOfAxles==6) {
			return "Truck with 6 Axles";
			}
		else {
			return "Truck with 8 or More Axles";
		}
	}

}
