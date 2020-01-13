package comm.thread;

public class SimpleThreadPriorityM {

	public static void main(String[] args) {
		
		Thread t1=new SImplethread("Saurav");
		t1.start();
		t1.setPriority(10);
		
		Thread t2=new SImplethread("Rahul");
		t2.start();
		t2.setPriority(7);
		
		Thread t3=new SImplethread("Sharma");
		t3.start();
		t3.setPriority(2);
		
		
	}

}
