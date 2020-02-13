package com.demo.hibernate.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.hibernate.Data;
import com.demo.hibernate.Dept;
import com.demo.hibernate.Emp;

public class JpaMain2 {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {

			//tx.begin();
			//Query query=em.createQuery("select e from Emp e where e.empName like '%an%'");
			Query query=em.createNamedQuery("simple");
			List<Emp> empList=query.getResultList();
		
			for(Emp e: empList) {
				System.out.println(e);
			}
			
			System.out.println("::---------Join Query execution------------:::");
			List<Data> data=em.createNamedQuery("joinQuery").getResultList();
			
			data.stream().forEach(d->System.out.println(d));
			
			//tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
	}
}
