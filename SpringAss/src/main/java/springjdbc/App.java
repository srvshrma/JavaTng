package springjdbc;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationCont.xml");
    	   CustomerDAO customer=context.getBean("dao",CustomerDAO.class);
    	   Customer c=customer.createCustomer(new Customer(UUID.randomUUID().toString(),"Saurav","srv@srv"));
    	   System.out.println(c);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
