package com.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.day3.Customer;

public class Lambda {
	 public void MyArrayList()
	 {
		 List<Customer> myList = new ArrayList<Customer>();
			myList.add(new Customer( "kishor", "kumar", "kihor102456@gmail.com", 21));
			myList.add(new Customer( "revathy", "krishnan", "rev102456@gmail.com", 21));
			myList.add(new Customer( "logesh", "srm", "logesh102456@gmail.com", 21));
			myList.add(new Customer( "gokul", "nath", "gokul102456@gmail.com", 21));
			myList.add(new Customer( "srinath", "thala", "srinath102456@gmail.com", 21));
			myList.add(new Customer( "loki5", "logesh", "Lo102456@gmail.com", 21));
			
			myList.sort((p1, p2) -> p1.getEmail().compareTo(p2.getEmail()));
			
			System.out.println(myList);
			
	 }
	 public void TreeMapCollection()
	 {
		 TreeMap<Integer, Customer> m =  
	             new TreeMap<Integer, Customer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);  
	                                   
	  m.put(1, new Customer( "kishor", "kumar", "kihor102456@gmail.com", 21));
	  m.put(2, new Customer( "surya", "kumar", "sk102456@gmail.com", 20));
	  m.put(5, new Customer( "ramesh", "kumar", "rk102456@gmail.com", 19));
	  m.put(4, new Customer( "suresh", "kumar", "SUk102456@gmail.com", 18));
	  m.put(3, new Customer( "vasanth", "kumar", "VK102456@gmail.com", 17));
	  System.out.println("After sorting Using Lamdaa : " + m); 
	 }
	 
	 public void SetwithLamda()
	 {
		 Set< Customer> my_arr = new TreeSet< Customer>((p1, p2) -> p1.getEmail().compareTo(p2.getEmail()));
		 my_arr.add(new  Customer("kishor", "kumar", "kihor102456@gmail.com", 21));
		 my_arr.add(new  Customer( "surya", "kumar", "sk102456@gmail.com", 20));
		 my_arr.add(new  Customer(  "vasanth", "kumar", "VK102456@gmail.com", 17));
	     System.out.println("Sorted in Tree Set are : " + my_arr);
	   
	 }

	public static void main(String[] args) {
		 new Lambda().MyArrayList();
		 new Lambda().TreeMapCollection();
		 new Lambda(). SetwithLamda();
	}

}
