package comm.tasking;

import java.time.LocalDate;
import lombok.*;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ToDo {
	private Task task;
	private String todoId;
	private LocalDate date;
	private boolean completed;
	//private RandomFortuneService fortuneService;
	final int Max=10;
	int i;

	public ToDo(Task task/*RandomFortuneService fortuneService*/) {

		this.task = task;
		//this.fortuneService = fortuneService;
	}

	public ToDo createTodo(String createdBy, String taskName, boolean completed) {
		//System.out.println("Your Daily Fortune>>> "+fortuneService.getDailyFortune());
		System.out.println("Creating a new task.");
		task = new Task();
		ToDo todo=new ToDo();
		task=task.createTask(taskName, createdBy);
		System.out.println("Sucessfully created\n Creating new Todo...");
		todo.setTodoId(UUID.randomUUID().toString());
		todo.setDate(LocalDate.now());
		todo.setCompleted(completed);
		todo.setTask(task);
		return todo;
	}
	

	public String getTodo() {
		return getTask().displayTask() + " todo id:" + getTodoId() + " todo date:" + getDate() + " Completed:" + completed;

	}

}
