package comm.tasking;

public class TaskTest {

	public static void main(String[] args) {
		ToDo td = new ToDo();
		td.createTodo("Saurav","Running",true);
		System.out.println(td.getTodo());

	}

}
