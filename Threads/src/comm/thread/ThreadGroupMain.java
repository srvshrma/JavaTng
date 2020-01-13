package comm.thread;

public class ThreadGroupMain {

	public static void main(String[] args) throws InterruptedException{
		new ThreadGroup("Saurav").start();;
	
		new ThreadGroup("sharma").start();;
		
		new ThreadGroup("Srv").start();;
		
		
		java.lang.ThreadGroup group=Thread.currentThread().getThreadGroup();
		System.out.println(group.activeCount());

	}

}
