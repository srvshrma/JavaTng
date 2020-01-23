package hibernatePerson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory;
	static {
		factory=new Configuration().configure().addAnnotatedClass(Person.class).buildSessionFactory();
		
	}
	private HibernateUtil() {
		
	}
		public static Session getSession() {
			
			return factory.openSession();
		}
		
		
	}

