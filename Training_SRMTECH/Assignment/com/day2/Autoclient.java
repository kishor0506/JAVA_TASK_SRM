package com.day2;

public class Autoclient {

	public static void main(String[] args) {
		Automobile Car = new Car("city", "honda", "sedan", 125, "black");
		System.out.println(Car.getVin());
		System.out.println(Car.getModel());
		System.out.println(Car.getName());
		System.out.println(Car.getManuf());
		Car.applyBrake(true);
		Car.cruisecontrol();
		System.out.println(" -----------------");
		
		Automobile Bike=new Bike("duke","ktm","naked",390,"orange");
		System.out.println(Bike.getManuf());
		System.out.println(Bike.getModel());
		System.out.println(Bike.getName());
		System.out.println(Bike.getVin());
		Bike.applyBrake(false);
		Bike.absBrake();
		
		System.out.println("-----------------");
		
		Automobile Bus=new Bus("volvo","kpn","sleeper",256);
		System.out.println(Bus.getModel());
		System.out.println(Bus.getManuf());
		System.out.println(Bus.getModel());
		System.out.println(Bus.getName());
		Bus.applyBrake(false);
		Bus.sleeper();
		
		System.out.println("-----------------");
		Automobile Truck=new Truck("bharatbenz","BBZ","heavy",25026);
		System.out.println(Truck.getModel());
		System.out.println(Truck.getManuf());
		System.out.println(Truck.getModel());
		System.out.println(Truck.getName());
		Truck.applyBrake(false);
		Truck.gear();
		
	}
	
	

}
