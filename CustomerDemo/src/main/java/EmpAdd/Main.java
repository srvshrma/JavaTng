package EmpAdd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
		Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee);

	}

}
