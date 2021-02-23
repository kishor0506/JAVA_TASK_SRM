package com.day2diamond;

public class Elect extends Electronicdetails implements Ipad,Mobile,Laptop{

	public Elect(String brand_name, String processor, String os, String model) {
		super(brand_name, processor, os, model);
		this.Brand_name=brand_name;
		this.model=model;
		this.os=os;
		this.processor=processor;
	}


	

	@Override
	public void color(String color) {
		 String Color = color;
		System.out.println("stock is available");
		
	}




	@Override
	public void processor(String processor) {
		System.out.println("stock is available");
		
	}




	@Override
	public void brand_name(String brand_name) {
		System.out.println("stock is available");
		
	}




	public void getDetails() {
//		System.out.println(+i);
		
	}

}
