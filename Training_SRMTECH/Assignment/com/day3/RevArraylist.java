package com.day3;
import java.util.*;

public class RevArraylist {

	public static void main(String[] args) {
		List<String>  mylist = new ArrayList<String>(); 
		mylist.add("kishor");
		mylist.add("srinath");
		mylist.add("gokul");
		mylist.add("loki");
		System.out.println("Original List : " + mylist); 
		Collections.reverse(mylist);
		  System.out.println("Modified List: " + mylist); 

	}

}
