package com.demo.spring.dao;

import com.demo.spring.entity.Emp;

public interface EmpDao {

	public String save(Emp e);
	public Emp findOne(int id);
}
