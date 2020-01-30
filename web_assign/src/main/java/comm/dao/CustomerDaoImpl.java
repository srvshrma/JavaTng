package comm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.model.Customer;

public class CustomerDaoImpl implements CustomerDao{

	SessionFactory factory=null;
	Session session= null;
	EntityManager manager=null;
	{
		session=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory().openSession();
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
	public List<Customer> getAllCustomers() {
Query query=manager.createQuery("from Customer",Customer.class);
		
		return query.getResultList();
		
	}

	@Override
	public void update(Customer customer) {
		manager.getTransaction().begin();
		manager.merge(customer);
		manager.getTransaction().commit();
		
	}

	@Override
	public Customer findById(int id) {
		manager.getTransaction().begin();
		Customer c=manager.find(Customer.class,id);
		manager.getTransaction().commit();
		return c;
	}

	@Override
	public void delete(Customer customer) {
		manager.getTransaction().begin();
		manager.remove(customer);
		manager.getTransaction().commit();
		
	}

}
