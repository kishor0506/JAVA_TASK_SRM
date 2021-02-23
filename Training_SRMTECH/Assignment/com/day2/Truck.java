package com.day2;

public class Truck extends Automobile {

	public Truck(String name, String manuf, String model, int vin) {
		super(name, manuf, model, vin);

	}
	public void gear() {
		System.out.println("C gear is activated ");
	}
}
