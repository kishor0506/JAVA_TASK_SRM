package com.day2.Order;

import java.util.Date;

import com.day2.Productdetails.Product;
import com.day2.Shipping.Shipping;

import com.day2.Paymentdetails.*;

public class Orderdetails {
	 static Product pd;
	    static Shipping sh;
	    static Payment pt;


 public void psdata() {
	 Product pd=new Product(0506,"kishor",2,123456,"speaker","electronics");
	 System.out.println(pd.toString());
 }
 public void rddata() {
	 Date currentdate = new Date();
	 Shipping sh=new Shipping(0506,"speaker","electronics",1500,2,"sholingnallur","chennai",currentdate);
	 System.out.println(sh.toString());
 }
 public static void pay(){
     pt.doPayment();
 }
  public static void getdata(){
     pd.viewProduct();
 }
 public static void ShippingDetails(){
     sh.showShipping();
 }
}
