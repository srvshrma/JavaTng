package hibernatePerson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDaoImpl implements PersonDAO {

	private Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session = HibernateUtil.getSession();
		transaction = session.getTransaction();
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
			public Person createPerson(Person person) {
				
				try {
					transaction.begin();
					session.save(person);
					transaction.commit();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		

	return person;
}

}
