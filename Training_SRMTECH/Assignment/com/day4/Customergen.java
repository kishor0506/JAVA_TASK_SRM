package com.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.day3.Customer;


public class Customergen {

	public static void main(String[]args) {
	ArrayList<Customer> arraylist=new ArrayList<Customer>();
	arraylist.add(new Customer("tharun","kumar","tharun10456@gmail.com",22));
	arraylist.add(new Customer("bala","subramani","bala11256@gmail.com",19));
	arraylist.add(new Customer("ramesh","ashok","ram18956@gmail.com",21));
	arraylist.add(new Customer("arun","pandi","arun91456@gmail.com",20));

	System.out.println(arraylist);
	Collections.sort(arraylist);
}

class YourCustomerObject<T,U>
{
	T obj;
	List obj1 = new ArrayList();
 	YourCustomerObject(T obj,U obj1)
	{
		this.obj =obj;
		this.obj1 = (List) obj1;
		if (obj instanceof Customer) {
			System.out.println("Instance of User is Created....");
		}	
	}
 	
 	
}

class SortCustomer implements Comparator<Customer>
{

	@Override
	public int compare(Customer obj1, Customer obj2) {
		
		return obj1.getFirstName().compareTo(obj2.getFirstName());
	}
	
}
}