package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		 Map<Integer, String> emps=new HashMap<>();
		// Map<Integer, String> emps=new Hashtable<>();
		//Map<Integer, String> emps = new TreeMap<>();
		emps.put(100, "Pavan");
		emps.put(101, "Arun");
		emps.put(102, "Chandra");
		emps.put(103, "Hiten");
		emps.put(104, "Amit");
		emps.put(105, "Chetan");

		System.out.println(emps);

		System.out.println(emps.get(101));

		Set<Integer> keys = emps.keySet();
		for (Integer x : keys) {
			System.out.println(x + "---->" + emps.get(x));
		}
		
		

	}

}
