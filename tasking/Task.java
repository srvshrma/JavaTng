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

	public Task createTask(String taskName, String createdBy) {
		Task task=new Task();
		task.setTaskId(UUID.randomUUID().toString());
		task.setTaskName(taskName);
		task.setCreatedBy(createdBy);
		return task;

	}

	public String displayTask() {
		return "Task Id:" + getTaskId() + " Task Name" + getTaskName() + " Name of creator:" + getCreatedBy();
	}

}