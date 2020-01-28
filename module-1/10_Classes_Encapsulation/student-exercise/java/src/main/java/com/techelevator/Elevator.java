package com.techelevator;

public class Elevator {
	
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
		this.currentFloor=1;
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

	public void openDoor() {
		doorOpen=true;
	}
	public void closeDoor() {
		doorOpen=false;
	}
	
	public void goUp(int desiredFloor) {
		if (this.isDoorOpen()==false && desiredFloor<=numberOfFloors && desiredFloor>currentFloor) {
			currentFloor=desiredFloor;
		}

		
	}
	public void goDown(int desiredFloor) {
		if (this.isDoorOpen()==false && desiredFloor>0 && currentFloor>desiredFloor) {
			currentFloor=desiredFloor;
		}
	}
	
	public static void main(String[] args) {
		Integer i = new Integer(2345);
		
		System.out.println(i / 2);
		
		System.out.println(i.intValue() / 2);
	}

	


}
