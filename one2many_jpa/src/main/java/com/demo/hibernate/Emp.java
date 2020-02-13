package com.demo.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "MYEMP")
@NamedQueries({
	@NamedQuery(name = "simple",query="select e from Emp e where e.empName like '%an%'"),
	@NamedQuery(name="joinQuery",query="select new com.demo.hibernate.Data(e.empName,e.city,e.salary,d.deptName,d.manager) "
							+ "from Dept d join d.emps e")
})
public class Emp {
	@Id
	@Column(name = "EMPNO")
	private int empId;

	@Column(name = "NAME")
	private String empName;

	@Column(name = "ADDRESS")
	private String city;

	@ManyToOne
	@JoinColumn(name="DNO")
	private Dept dept;
	
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// @Column(name="SALARY")
	private double salary;

	public Emp() {

	}

	public Emp(int empId, String empName, String city, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.city = city;
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + " " + empName + " " + salary;
	}

}
