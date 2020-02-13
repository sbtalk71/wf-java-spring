package com.demo.hibernate;

public class Data {

	private String name;
	private String city;
	private double salary;
	private String deptName;
	private String manager;
	public Data(String name, String city, double salary, String deptName, String manager) {
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.deptName = deptName;
		this.manager = manager;
	}
	@Override
	public String toString() {
		return name+" "+city+" "+salary+" "+deptName+" "+manager;
	}
	
	
	
}
