package com.demo.abstractdemo;

public class Main {

	public static void main(String[] args) {
		Figure ref;
		Triangle t= new Triangle(20, 10);
		Rectangle r=new Rectangle(20, 20);
		
		ref=t;
		ref.area();
		
		ref=r;
		ref.area();

		ref=new Figure(20,30) {
			
			@Override
			public double area() {
				return dim1*dim2/2;
			}
		};
	
	}

}
