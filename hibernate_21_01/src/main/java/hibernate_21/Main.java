package hibernate_21;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Main {

	public static void main(String[] args) {
		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = factory.openSession();
			Person person = new Person(UUID.randomUUID().toString(), "Saurav", LocalDate);
			DateTimeFormatter formatter= new DateTimeFormatter();
			 formatter = 
		

			System.out.println(person);
			session.getTransaction().begin();
			session.save(person);
			session.getTransaction().commit();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
