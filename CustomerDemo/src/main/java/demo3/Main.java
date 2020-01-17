package demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
			Employee employee = context.getBean("employee", Employee.class);
			Address address = context.getBean("add", Address.class);
			address.setAddressLine1("Gurgaon");
			address.setAddressLine2("Haryana");
			address.setPhoneNo("89897987897");
			address.setZipCode("123321");
			employee.setAddress(address);

			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
