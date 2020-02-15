package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.demo.spring.entity.Emp;

@RunWith(BlockJUnit4ClassRunner.class)
public class EmpTest {

	Emp e;
	@Before
	public void init() {
		System.out.println("Init run....");
		e=new Emp(100, "Tinku", "Hyderabad", 34000);

	}
	
	@Test
	public void testName() {
		assertEquals("Tinku", e.getEmpName());
	}
	
	@Test
	public void testSalary() {
		assertEquals(34000.45, e.getSalary(),.50);
		
	}
	
	@After
	public void cleanup() {
		System.out.println("destroy run..");
		e=null;
	}
	
	
}
