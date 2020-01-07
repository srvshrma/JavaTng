package comm.Taskkk;

import java.time.LocalDate;
import java.util.UUID;

public class MyApp {

	public static void main(String[] args) {
		Task myTask1=new Task(UUID.randomUUID().toString(),"Running",LocalDate.now(),true);
		Task myTask2=new Task(UUID.randomUUID().toString(),"Running",LocalDate.now(),true);
		System.out.println("Task1 Details: \n"+myTask1+"\nTask2 Details: \n"+myTask2);
		System.out.println(myTask1==myTask2);
		System.out.println(myTask1.equals(myTask2));

	}

}
