package com.demo.spring.service;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.entity.Emp;

public class EmpService {

	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String loc, double sal) {
		String resp = dao.save(new Emp(id, name, loc, sal));
		return resp;
	}
}
