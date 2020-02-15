package com.demo.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.demo.spring.entity.Emp;
import com.demo.spring.rest.EmpRestController;

@SpringBootTest
class EmpServiceApplicationTests {

	@Autowired
	EmpRestController controller;
	
	@Test
	void testFinder (){
		ResponseEntity<Emp> resp=controller.findEmp(102);
		assertEquals("Rekha", resp.getBody().getEmpName());
	}

}
