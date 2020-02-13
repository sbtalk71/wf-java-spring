package com.demo.inheritance;

public class Main2 {

	public static void main(String[] args) {
		Person p = new Person(100, "Pavan");
		Employee e = new Employee(102, "Arun", 56000);
		TraineeEmp te = new TraineeEmp(103, "Chandra", 43000, "good");

		// System.out.println(p.getDetails());
		// System.out.println(e.getDetails());
		// System.out.println(te.getDetails());

		Person p1 = new Employee(104, "Sai", 45000);
		System.out.println(p1.getDetails());
		
		Employee e2=(Employee)new Person(100, "Pavan");
		System.out.println(e2.getDetails());
		/*
		 * Test t=new Test(); t.f1();
		 * 
		 * Main2 m2=new Main2();
		 * 
		 * Test2 t2= m2.new Test2();
		 */
	}

	static class Test {
		public void f1() {
			System.out.println("This is f1()..");
		}
	}
	
	 class Test2 {
		public void f2() {
			System.out.println("This is f2()..");
		}
	}
}
