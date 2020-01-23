package hibernatePerson;

import java.time.LocalDate;

public class Main {
	private static PersonService service;
	static{
			service=new PersonServiceImpl();
	}
	public static void main(String[] args) {
	
		Person p=service.createPerson(new Person("6346","Saurav",LocalDate.now()));
		System.out.println(p);
		
	}
}

