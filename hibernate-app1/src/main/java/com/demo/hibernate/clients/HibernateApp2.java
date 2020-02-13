package com.demo.hibernate.clients;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.Emp;

public class HibernateApp2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		try {

			Emp e=session.get(Emp.class, 105);
			System.out.println(e);
			
			session.delete(e);
			
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
