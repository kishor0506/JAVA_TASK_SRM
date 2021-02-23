package com.day2;

import java.io.Serializable;

public class Automobile implements Serializable {
	private String name;
	private String manuf;
	private String model;
	private int vin;

	public Automobile(String name, String manuf, String model, int vin) {
		super();
		this.name = name;
		this.manuf = manuf;
		this.model = model;
		this.vin = vin;
	}

	public void applyBrake(boolean isBrakeapplied) {
		if (isBrakeapplied) {
			System.out.println("Stop the vehicle");
		} else {
			System.out.println("the vehicle is still running");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManuf() {
		return manuf;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public void cruisecontrol() {
		System.out.println("cruise control available in car");

	}

	public void absBrake() {
		System.out.println("absBrake is activated");
	}

	public void sleeper() {
		System.out.println("sleeper coach is available");
	}
	public void gear() {
		System.out.println("C gear is activated ");
	}
}
