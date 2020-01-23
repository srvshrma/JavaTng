package annotationjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CustomerConfig.class);
		Customer customer=context.getBean("customer",Customer.class);
		customer.setUId("100");
		customer.setF_name("Saurav");
		customer.setL_name("Sharma");
		customer.setEmail("srv@srv");
		System.out.println(customer);

	}

}
