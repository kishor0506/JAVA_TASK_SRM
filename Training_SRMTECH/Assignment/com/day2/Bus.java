package com.day2;

public class Bus extends Automobile{

	public Bus(String name, String manuf, String model, int vin) {
		super(name, manuf, model, vin);
	
	}
	public void sleeper() {
		System.out.println("sleeper coach is available");
	}
}
