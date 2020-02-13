package com.demo;

public class Duck {
	static int duckCount;
	static {
		System.out.println("Only once executed...");
	}
	public Duck() {
		duckCount++;
	}
	
	
	public static void getDuckDetails() {
		System.out.println("No details yet..");
	}
	
	public void getDuckName() {
		System.out.println("No Name yet..");
	}
	
	public static void main(String[] args) {
		getDuckDetails();
		//getDuckName();
	}
}
