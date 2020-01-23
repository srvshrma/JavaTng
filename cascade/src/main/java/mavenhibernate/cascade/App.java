package mavenhibernate.cascade;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        try {
        	//int theId = 1;
        	SessionFactory factory=new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructionDetail.class).buildSessionFactory();
        	
        	Session session=factory.openSession();
        	Instructor instructor=new Instructor("Juned","Aslam","junnu@junnu");
        	InstructionDetail detail=new InstructionDetail("https://youtube.com/junnu","Singer");
        	//instructor.setDetail(new InstructionDetail("https://youtube.com/junnu","Singer"));
        instructor.setInstructorDetail(detail);
        
        	session.getTransaction().begin();
        	//InstructionDetail detail=session.get(InstructionDetail.class,theId);
        	System.out.println(instructor);
        	session.save(instructor);
        	session.getTransaction().commit();
        	//System.out.println(detail);
        	//System.out.println(detail.getInstructor());
        	System.out.println("Done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    
    }
}
