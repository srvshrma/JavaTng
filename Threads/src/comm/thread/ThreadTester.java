package comm.thread;

public class ThreadTester {
	public static void main(String[] args) {
		HelloRunner r=new HelloRunner();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		
		t1.start();
		t2.start();}
	


		

}
