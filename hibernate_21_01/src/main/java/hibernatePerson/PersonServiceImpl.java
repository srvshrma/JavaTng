package hibernatePerson;

public class PersonServiceImpl implements PersonService {
	private PersonDAO dao;
	{
		dao=new PersonDaoImpl();
	}
	@Override
	public Person createPerson(Person person) {
		
		return dao.createPerson(person);
		
	}

}
