package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalCoachSeats = totalCoachSeats;
		this.totalFirstClassSeats = totalFirstClassSeats;
	}

	
	
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
	
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats-bookedFirstClassSeats; 
	}
	
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		
		if (forFirstClass==true && this.getAvailableFirstClassSeats()-totalNumberOfSeats>0) {
			this.bookedFirstClassSeats = bookedFirstClassSeats+totalNumberOfSeats;
			return true;
		}
		else if(forFirstClass==false && this.getAvailableCoachSeats()-totalNumberOfSeats>0) {
			this.bookedCoachSeats = bookedCoachSeats+totalNumberOfSeats;
			return true;
		}
		return false;
		
	}
	
}
