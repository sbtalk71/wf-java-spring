package com.demo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("unchecked")
public class SetToList {

	public static void main(String[] args) {

		// Set<String> names=new HashSet<>();
		SortedSet<String> names = new TreeSet<>();
		
		names.add("pavan");
		names.add("arun");

		names.add("shiva");
		names.add("kirthi");
		names.add("pavan");
		names.add("arun");

		System.out.println(names);

		System.out.println(names);

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}

		for (String s : names) {
			System.out.println(s);
		}
		
		
		List<String> list=new ArrayList<>(names);
		
		List hetro=new ArrayList();
		hetro.add(123);
		hetro.add("Pavan");
	}

}
