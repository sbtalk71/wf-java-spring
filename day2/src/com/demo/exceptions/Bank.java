package com.demo.exceptions;

public class Bank {

	private double balance = 5000;

	public double withdraw(double amount) throws LowBalanceExceotion{
		if (balance < amount) {
			throw new LowBalanceExceotion("Your balance is Low");
		} else {
			balance = balance - amount;
			System.out.println("Transaction Successfull..");
			return balance;
		}
	}
}
