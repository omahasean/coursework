package com.porsche;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCarApp {
	
	public static void main(String[] args) {
	
	Engine engine = new Engine(6, "Gas") {
		
	};
	
	Car seansCar = new Car("Black", "Fiesta");

	seansCar.setColor("Black");
	seansCar.setModel("Fiesta");
	seansCar.setYear(2014);
	seansCar.setTires(null);
	
	
	System.out.println("My car is a: " + seansCar.getColor() + " "+ seansCar.getModel() + " " +  seansCar.getYear());
	
	Car joesCar = new Car("Red","Focus");
	
	joesCar.setModel("Focus");
	joesCar.setYear(2019);
	System.out.println("Joe's car is a: " + joesCar.getYear() + " " + joesCar.getModel());
	
	List<Car> carList = new ArrayList<Car>();
	carList.add(joesCar);
	carList.add(seansCar);
	System.out.print(carList.size());
	
	Map<String,Car> carMap = new HashMap <String,Car>();
	carMap.put("Sean", seansCar);
	carMap.put("Joe", joesCar);
	
	
	
	}

}
