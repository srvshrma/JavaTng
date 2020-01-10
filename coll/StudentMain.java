package comm.coll;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("Saurav", 9.0, 12));
		set.add(new Student("Rahul", 9.8, 19));
		set.add(new Student("Tani", 7.1, 30));
		for (Student s : set) {
			System.out.println(s + "\n");
		}
	}

}
