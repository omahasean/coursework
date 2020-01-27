package com.techelevator.automobile;

public class CarApp {
	
	public static void main (String[] args) {

	Automobile a1 = new Automobile();
	
	a1.setMake("Ford");
	a1.setModel("Mustang");
	a1.setYear(2020);
	a1.setNumberOfDoors(2);
	
	SportsCar sportscar = new SportsCar();
	sportscar.setMake("BMW");
	sportscar.setModel("M5");
	sportscar.setSeatBelts(true);
	System.out.println(sportscar.toString());
	
	SportsCar sportscar2 = new SportsCar();
	sportscar2.setMake("BMW");
	sportscar2.setModel("855");
	sportscar2.setSeatBelts(true);
	System.out.println(sportscar2.toString());
	
	}
	
}
