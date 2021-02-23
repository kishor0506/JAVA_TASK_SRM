package com.day3;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;

public class Convert {


		 public static void main(String[] args) {
		    LinkedList<String> linkedlist = new LinkedList<String>();
		    linkedlist.add("kishore");
		    linkedlist.add("srinath");
		    linkedlist.add("gokul");
		    linkedlist.add("loki");
		    linkedlist.add("srm");

		    List<String> list = new ArrayList<String>(linkedlist);
		    System.out.println("linkedlist :"+linkedlist);
		    
		    System.out.println("Array list :"+list);
		 
		    }
		 
		}


