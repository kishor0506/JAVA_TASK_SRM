package com.day2;

public class Bike extends Automobile {
	private String color;
	public Bike(String name, String manuf, String model, int vin,String color) {
		super(name, manuf, model, vin);
		this.color=color;
	
	}
	public void absBrake() {
		System.out.println("absBrake is activated");
	}

}
