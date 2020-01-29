package com.techelevator.TollExercise;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

	public static void main(String[] args) {
		//generate empty list to populate with vehicles
		List <Vehicle> vehicleList = new ArrayList<Vehicle>();
		//generate both cars
		Car car = new Car(false);
		Car carTowing = new Car(true);
		//generate all trucks
		Truck truck4 = new Truck(4);
		Truck truck6 = new Truck(6);
		Truck truck8 = new Truck(8);
		//generate tank
		Tank tank = new Tank();
		//add vehicles to list
		vehicleList.add(car);
		vehicleList.add(carTowing);
		vehicleList.add(truck4);
		vehicleList.add(truck6);
		vehicleList.add(truck8);
		vehicleList.add(tank);
		//loop through list and print out vehicle type, distance traveled and toll
		System.out.println(String.format("%-30s | %-20s | %-30s" , "Vehicle", "Distance Traveled", "Toll $"));
		int totalDistance= 0;
		double totalToll = 0;
		for (Vehicle v : vehicleList) {
			int distanceRandom = (int)(Math.random() * ((250-10)+1))+10;
			totalDistance += distanceRandom;			
			System.out.println(String.format("%-30s | %-20s | %-30s" , v.getType(), distanceRandom, v.calculateToll(distanceRandom)));
			totalToll += v.calculateToll(distanceRandom);
		}
		System.out.println("______________________________________________________________________________");
		System.out.println("Total Distance: " + totalDistance);
		System.out.println("Total Toll Cost: " + totalToll);
	}

}
