package com.day3;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_sort {

	public static void main(String[] args) {
		ArrayList<Customer> arraylist=new ArrayList<Customer>();
		arraylist.add(new Customer("tharun","kumar","tharun10456@gmail.com",22));
		arraylist.add(new Customer("bala","subramani","bala11256@gmail.com",19));
		arraylist.add(new Customer("ramesh","ashok","ram18956@gmail.com",21));
		arraylist.add(new Customer("arun","pandi","arun91456@gmail.com",20));
		
		Collections.reverse(arraylist);
	
		  //for(Customer cus: arraylist){
			//	System.out.println(cus);
		arraylist.forEach(System.out::println);
		
	}

}

