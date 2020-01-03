package comm.tasking;
import lombok.*;
import java.util.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task {
		private String taskId;
		private String taskName;
		private String createdBy;
		
//static {
//	t=new Task();
//}

public void createTask(String taskName,String createdBy) {
	
	setTaskId(UUID.randomUUID().toString());
	setTaskName(taskName);
	setCreatedBy(createdBy);

	
	
}	
public String displayTask() {
	return " Task Id: " + getTaskId() + "Task Name "+getTaskName()+"Name of creator: "+getCreatedBy();
}
	
}