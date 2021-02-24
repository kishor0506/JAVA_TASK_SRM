package com.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




class Customer
{
    int age;
    String FirstName,LastName,Email;
 
    
    public Customer(int age, String FirstName, String LastName ,String Email)
    {
        this.age = age;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email=Email;
    }
 
    
    public String toString()
    {
        return "Age"+" "+this.age + " " + "FirstName" +" "+ this.FirstName +
                           " " +"LastName"+" "+ this.LastName+" "+"Email"+" "+this.Email;
    }
}
 
 
class Sortbyage implements Comparator<Customer>
{
    
    public int compare(Customer a, Customer b)
    {
        return b.age - a.age;
    }
}
class SortByFirstName implements Comparator<Customer>
{
    
    public int compare(Customer a, Customer b)
    {
        return a.FirstName.compareTo(b.FirstName);
    }
}
public class Sort {

	public static void main(String[] args) {
		
	

		
				ArrayList<Customer> ar = new ArrayList<Customer>();
		        ar.add(new Customer( 11,"surya", "kumar","sk123@gmail.com"));
		        ar.add(new Customer( 22,"linga", "lin","ll342@gmail.com"));
		        ar.add(new Customer(13, "kavariman", "raja","kr347@gmail.com"));
		 
		        System.out.println("Unsorted Arraylist");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
		 
		        Collections.sort(ar, new Sortbyage());
		 
		        System.out.println("\nSorted by Age of Customer");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
		 
		        Collections.sort(ar, new SortByFirstName());
		 
		        System.out.println("\nSorted by FirstName of Customer");
		        for (int i=0; i<ar.size(); i++)
		            System.out.println(ar.get(i));
				

			}

		
	}


