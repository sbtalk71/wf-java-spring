package query;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.hibernate.Dept;
import com.demo.hibernate.Emp;

public class Query1 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		//Transaction tx = session.beginTransaction();

		try {
			
			Query<Emp> query=session.createQuery("from Emp e where e.empName like '%an%'");
			List<Emp> empList=query.getResultList();
			empList.stream().forEach(e->System.out.println(e));
			
		//	tx.commit();
		} catch (HibernateException e) {
			//tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sf.close();
		}

	}

}
