package com.demo.exceptions;

public class LowBalanceExceotion extends Exception {

	private static final long serialVersionUID = 1L;


	public LowBalanceExceotion() {

	}

	public LowBalanceExceotion(String message) {
		super(message);
	}
	
	
	@Override
	public String toString() {
		
		return "Your Balance is Low, deposit some money";
	}

}
