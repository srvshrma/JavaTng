package comm.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.model.Customer;

public class CustomerDaoImpl implements CustomerDAO {

	EntityManager manager=null;
	Session session=null;
	SessionFactory factory=null;
	public SessionFactory getMySessionFactory() {
		
		return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
	}
	{
		session=getMySessionFactory().openSession();
		session.getTransaction().begin();
		manager=session.getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
				
	}
	@Override
	public Customer createCustomer(Customer customer) {
		manager.getTransaction().begin();
		manager.persist(customer);
		manager.getTransaction().commit();
		return customer;
	}
	@Override
	public List<Customer> getAllCustomer() {
		Query query=manager.createQuery("from Customer",Customer.class);
		
		return query.getResultList();
	}

}
