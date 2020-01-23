package jdbcTemplate;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
	static CustomerService service;
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=null;
		
		try {
			context=new ClassPathXmlApplicationContext("applicationContext.xml");
			service=context.getBean("service",CustomerService.class);
			System.out.println(context);
			System.out.println(service);
			
			List<Customer> l=service.getAllCustomers();
			System.out.println(l.isEmpty());
			l.forEach(c->{
				System.out.println(c);
			
		});
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		finally {
			
			context.close();}
		
		}
		
		

	}

