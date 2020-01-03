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
	
	
public void createTodo(String createdBy,String taskName,boolean completed) {
	System.out.println("Creating a new task.");
	task=new Task();
	task.createTask(taskName,createdBy);
	System.out.println("Sucessfully created a task.");
    setTodoId(UUID.randomUUID().toString());
    setDate(LocalDate.now());
    setCompleted(completed);
	
}
public String getTodo() {
	return task.displayTask()+"todo id: "+getTodoId()+"todo date: "+getDate()+"Completed: "+completed;
	
	
}

}
