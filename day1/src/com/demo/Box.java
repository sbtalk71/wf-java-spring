package com.demo;

public class Box {

	private int length;
	private int breadth;
	private int height;
	private double weight;

	public Box() {

	}

	public Box(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public Box(int length, int breadth, int height, double weight) {
		this(length, breadth, height);
		this.weight = weight;
	}

	public double getVolume() {
		return length * breadth * height;
	}

	public double getWeight() {
		return this.weight;
	}
}
