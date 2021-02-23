package com.day2;

public class Car extends Automobile {
	private String color;

	public Car(String name, String manuf, String model, int vin, String color) {
		super(name, manuf, model, vin);
		this.color = color;
	}
	public void cruisecontrol() {
		System.out.println("cruise control available in car");
		
	}

}
