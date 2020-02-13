package com.demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		
		//Set<String> names=new HashSet<>();
		SortedSet<String> names=new TreeSet<>();
		names.add("pavan");
		names.add("arun");
		//names.add(1,"thara");
		names.add("shiva");
		names.add("kirthi");
		names.add("pavan");
		names.add("arun");
		
		System.out.println(names);
		
		//names.remove(2);
		
		//names.add(2,"varun");
		System.out.println(names);
		
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println(name);
		}

		for(String s:names) {
			System.out.println(s);
		}
		
		
		/*
		 * for(int x=0;x<names.size();x++) { System.out.println(names.get(x)); }
		 */
	}

}
