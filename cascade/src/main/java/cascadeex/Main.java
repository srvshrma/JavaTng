package cascadeex;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class).addAnnotatedClass(Image.class).buildSessionFactory();

			Session session = factory.openSession();
			Scanner sc=new Scanner(System.in);
			String p = sc.nextLine();
		int choice = 0;
		switch(choice) {
		case 1:System.out.println("Create : ");
			Album a = new Album("Scenery", LocalDate.now());
			Image i = new Image(UUID.randomUUID().toString());
			a.setImage(i);
			session.beginTransaction();
			System.out.println(i);
			session.save(a);  
			session.getTransaction().commit();
			System.out.println("Done");
		case 2: 
			System.out.println("Delete : ");
			session.beginTransaction();
			int id=1;
			Album al=session.get(Album.class, id);
			System.out.println(al);
			if(al!=null) {
				System.out.println(al);
				session.delete(al);
			}
			session.getTransaction().commit();
			System.out.println("Done");
			
		}
	
		
		}
	}


