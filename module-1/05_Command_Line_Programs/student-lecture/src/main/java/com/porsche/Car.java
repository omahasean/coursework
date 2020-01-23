package com.porsche;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	//class/instance variables
	
	//Access modifiers -> private and public
	// Method Signature = private || public -> Return type -> methodName -> (arguments)
	private String color;
	private String model;
	private int year;
	private boolean isStarted;
	private List<Tires> tires = new ArrayList<Tires>();
	private Engine engine = new Engine(6, "Gas");
	
	
	public Car (String color, String model) {
		this.color = color;
		this.model = model;
	}

	public boolean startCar() {
		isStarted=true;
		driveCar();
		return isStarted;
	}
	private void driveCar() {
		System.out.println("Vroom Vroom");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Tires> getTires() {
		return tires;
	}
	public void setTires(List<Tires> tires) {
		this.tires = tires;
	}
	public Engine getEngine() {
		return engine;
	}
	
	
	
}
