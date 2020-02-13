package com.demo.hibernate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
public class Emp {
	@Id
	@Column(name = "EMPNO")
	private int empId;

	@Column(name = "NAME")
	private String empName;

	@Embedded
	private Address address;

	// @Column(name="SALARY")
	private double salary;

	public Emp() {

	}

	public Emp(int empId, String empName, Address address, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + " " + empName + " " + salary;
	}

}
