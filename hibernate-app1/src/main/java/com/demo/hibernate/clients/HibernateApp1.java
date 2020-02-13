package com.demo.hibernate.clients;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.Address;
import com.demo.hibernate.Emp;

public class HibernateApp1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		try {

			Address addr=new Address("12-22-13", "Hyderabad", 500098);
			Emp e= new Emp(200, "Kamal",addr, 89000);
			
			session.persist(e);
			session.flush();
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sf.close();
		}

	}

}
