package com.demo.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name="DOOR_NO")
	private String doorNo;
	
	@Column(name="ADDRESS")
	private String city;
	
	@Column(name="PIN")
	private int pin;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String doorNo, String city, int pin) {
		this.doorNo = doorNo;
		this.city = city;
		this.pin = pin;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return doorNo+" "+city+" "+pin;
	}
	
}
