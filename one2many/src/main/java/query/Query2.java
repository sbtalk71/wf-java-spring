package query;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.hibernate.Data;

public class Query2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		//Transaction tx = session.beginTransaction();

		try {
			
			Query<Data> query=
					session.createQuery(
							"select new com.demo.hibernate.Data(e.empName,e.city,e.salary,d.deptName,d.manager) "
							+ "from Dept d join d.emps e");
			List<Data> empList=query.getResultList();
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
