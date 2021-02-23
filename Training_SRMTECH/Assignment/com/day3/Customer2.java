package com.day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class Customer2 {


	public static void main(String[] args) {
		
		List<Customer> myList = new ArrayList<Customer>();
		//Set myList = new TreeSet();
		myList.add(new Customer("kishor", "kumar", "kishore1024165", 21));
		myList.add(new Customer("kumar", "samy", "kumar485", 20));
		myList.add(new Customer("surya", "krish", "surya485", 26));
		myList.add(new Customer("sanjay", "ramsay", "sanjay78879", 22));
		
//		Collections.sort(myList,new sortbasedonFirstName());
		Iterator<Customer> itr= myList.iterator();
		while(itr.hasNext())
		{
			System.out.println("==>"+itr.next().toString());	
		}
		
	}
	

	class sortbasedonFirstName implements Comparator< Customer>{

		@Override
		public int compare(Customer obj1, Customer obj2) {
			// TODO Auto-generated method stub
			return obj1.getLastname().compareTo(obj2.getFirstname());
		}
		
	}
}

