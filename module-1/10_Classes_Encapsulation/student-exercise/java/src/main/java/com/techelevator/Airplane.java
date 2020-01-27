package com.techelevator;

public class Airplane {
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	public int availableFirstClassSeats(String PlaneNumber, int totalFirstClassSeats, int bookedFirstClassSeats) {
		return totalFirstClassSeats-bookedFirstClassSeats; 
	}
	
	public int availableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
}
