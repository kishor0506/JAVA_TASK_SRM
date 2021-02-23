package com.day2.Order;

import com.day2.Productdetails.Product;
import com.day2.Order.*;
import com.day2.Paymentdetails.Payment;

public class Delivery{

	public static void main(String[] args) {
	
	    System.out.println("product details");
		new Orderdetails().psdata();
	
		System.out.println("shipping details");
		new Orderdetails().rddata();
		
	
	}

}
