package com.demo.hibernate.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.hibernate.Dept;
import com.demo.hibernate.Emp;

public class JpaMain1 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {

			tx.begin();
			Emp e = new Emp(200, "Raja", "Chennai", 67000);
			Dept dept = em.find(Dept.class, 20);
			e.setDept(dept);
			em.persist(e);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
	}
}
