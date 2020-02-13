package com.demo.exceptions;

public class Main {

	public static void main(String[] args) {
		Bank b = new Bank();
		try {
			b.withdraw(1000);
			b.withdraw(2000);
			b.withdraw(3000);
		} catch (LowBalanceExceotion e) {
			e.printStackTrace();
		}
		System.out.println("Bank tx done...");
	}

}
