package com.demo.spring.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.entity.Emp;
import com.demo.spring.service.EmpService;

@RunWith(MockitoJUnitRunner.class)
public class TestEmpService {

	@Mock
	EmpDao dao;
	
	@Spy
	Emp e=new Emp(100, "Raju", "bangalore", 45000);
	
	@InjectMocks
	EmpService service;
	
	@Test
	public void testSave() {
		
		
		when(dao.save(e)).thenReturn("Saved");
		assertEquals("Saved", dao.save(e));
		reset(dao);
	}
	
	@Test
	public void testFindOne() {
		when(dao.findOne(100)).thenReturn(e);
		assertEquals(100, e.getEmpId());
		reset(dao);
	}
	
	
}
