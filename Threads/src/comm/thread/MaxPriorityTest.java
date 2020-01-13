package comm.thread;

public class MaxPriorityTest {

	public static void main(String[] args) {
	
		ThreadGroup groupNorm=new ThreadGroup("Normal Prio....");
		Thread threadMax=new Thread(groupNorm,"Max Prio....");
		Thread threadMin=new Thread(groupNorm,"Min prio,....");
		
		threadMax.setPriority(Thread.MAX_PRIORITY);
		groupNorm.setPriority(Thread.NORM_PRIORITY);
		threadMin.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Group's prio.."+groupNorm.getPriority());
		System.out.println("Thread's max priority...."+threadMax.getPriority()); 
		System.out.println("Thread's min priority...."+threadMin.getPriority());

	}

}
