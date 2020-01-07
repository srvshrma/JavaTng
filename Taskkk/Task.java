package comm.Taskkk;

import java.time.LocalDate;
public class Task {
	private String taskId;
	private String taskName;
	private LocalDate date;
	private boolean isCompleted;
	public Task() {
		super();
	}
	public Task(String taskId, String taskName, LocalDate date, boolean isCompleted) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.date = date;
		this.isCompleted = isCompleted;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Task myTask=null;
		boolean isEqual=false;
		if(obj instanceof Task) {
			myTask=(Task) obj;
		}
		if((this.getTaskName()==myTask.getTaskName())&&(this.getDate().equals(myTask.getDate()))&&(this.isCompleted==myTask.isCompleted))
		{
			isEqual=true;
		}
		return isEqual;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", date=" + date + ", isCompleted=" + isCompleted
				+ "]";
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	

}
