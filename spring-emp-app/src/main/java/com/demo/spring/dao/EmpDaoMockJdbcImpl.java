package com.demo.spring.dao;

import com.demo.spring.entity.Emp;

public class EmpDaoMockJdbcImpl implements EmpDao{

	@Override
	public String save(Emp e) {
		
		return "Emp Saved with id "+e.getEmpId();
	}

}
