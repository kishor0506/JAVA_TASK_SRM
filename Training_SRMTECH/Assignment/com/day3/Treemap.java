package com.day3;

import java.util.*;

public class Treemap {

	public static void main(String[] args) {
		 Map<String, String> Treemap =  new TreeMap<String, String>(Collections.reverseOrder()); 
	  
	        // Put elements to the map 
	        Treemap.put("1", "kishor"); 
	        Treemap.put("2", "niranjan"); 
	        Treemap.put("3", "surya"); 
	        Treemap.put("4", "kumar"); 
	        Treemap.put("5", "jana"); 
	  
	        Set set = Treemap.entrySet(); 
	        Iterator i = set.iterator(); 
	  
	  
	        while (i.hasNext()) { 
	            Map.Entry me = (Map.Entry)i.next(); 
	            System.out.print(me.getKey() + ": "); 
	            System.out.println(me.getValue()); 
	        } 

	}

}