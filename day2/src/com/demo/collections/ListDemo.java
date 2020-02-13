package com.demo.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//List<String> names=new ArrayList<>();
		
		List<String> names=new LinkedList<>();
		
		names.add("pavan");
		names.add("arun");
		names.add(1,"thara");
		names.add("shiva");
		names.add("kirthi");
		names.add(0,"pavan");
		names.add("arun");
		
		System.out.println(names);
		
		names.remove(2);
		
		names.add(2,"varun");
		System.out.println(names);
		
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println(name);
		}

		for(String s:names) {
			System.out.println(s);
		}
		
		
		for(int x=0;x<names.size();x++) {
			System.out.println(names.get(x));
		}
		
		
		Collections.sort(names,(o1,o2)-> {return o2.compareTo(o1);});
		
		System.out.println(names);
		
		
	}

}
