package com.techelevator.TollExercise;

public class Car implements Vehicle{

	private boolean hasTrailer;
	
	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}
	
	public boolean isHasTrailer() {
		return hasTrailer;
	}


	public double calculateToll(int distance) {
		double toll = distance * 0.020;
			if (hasTrailer == true) {
				toll = toll + 1.00;	
				return toll;
			}
		return toll;
	}

	@Override
	public String getType() {
		if(hasTrailer==true) {
			return "Car with Trailer";
		}
		return "Car";
	}

}
