package com.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.entity.Emp;

@Service
public class EmpService {

	@Autowired
	private EmpDao dao;

	public String registerEmp(int id, String name, String loc, double sal) {
		String resp = dao.save(new Emp(id, name, loc, sal));
		return resp;
	}
}
