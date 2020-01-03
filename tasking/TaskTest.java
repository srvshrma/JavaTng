package comm.tasking;

import java.util.Scanner;

public class TaskTest {

	private static final int MAX = 5;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int counter = -1;
		ToDo todos[] = new ToDo[MAX];
		int choice = 0;
		ToDo todo = new ToDo();
		ToDo tempTodo = null;
		do {
			System.out.println("1.Add new todo.");
			System.out.println("2.Display all todo.");
			System.out.println("0.Exit");
			System.out.println("Select your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (counter == MAX - 1) {
						System.out.println("Cannot create more todo... ");
						break;
				}
				System.out.println("task created by: ");
				String createdBy=sc.next();
				System.out.println("Task name: ");
				String taskName=sc.next();
				System.out.println("Completed? ");
				boolean completed=sc.nextBoolean();
				tempTodo=todo.createTodo(createdBy, taskName, completed);
				todos[++counter]=tempTodo;
				break;
			case 2:
				for(int i=0;i<=counter;i++) {
					
					System.out.println("Displaying the todos.../n"+todos[i].getTodo());
				}
				break;
			case 0:{
				System.exit(0);
			}
			default:
			System.out.println("Invalid!!");	
			break;
			}
		} while (choice != 0);
	}

}
