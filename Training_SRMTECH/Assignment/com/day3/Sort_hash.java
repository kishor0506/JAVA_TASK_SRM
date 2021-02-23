package com.day3;

import java.util.*;
import java.util.TreeMap;
import java.util.HashMap;

public class Sort_hash {
	static Map<String, Integer> map = new HashMap<>();

	public static void sortbykey() {
		TreeMap<String, Integer> TreeMap = new TreeMap<>(map);
		for (Map.Entry<String, Integer> entry : TreeMap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}

	public static void main(String[] args) {
		{
			
			map.put("Jayant", 80);
			map.put("Abhishek", 90);
			map.put("Anushka", 80);
			map.put("Amit", 75);
			map.put("Danish", 40);

			
			sortbykey();
		}
	}

}
