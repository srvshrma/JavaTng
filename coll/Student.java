package comm.coll;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Student implements Comparable<Student> {
	private String studentName;
	private double cgpa;
	private int rollNo;

	@Override
	public int compareTo(Student student) {
		int result = 0;

		if (this.getCgpa() > student.getCgpa()) {
			return -1;
		}
		if (this.getCgpa() < student.getCgpa()) {
			return 1;
		}
		if (this.getCgpa() == student.getCgpa()) {
			return 0;
		}

		return result;
	}

}
