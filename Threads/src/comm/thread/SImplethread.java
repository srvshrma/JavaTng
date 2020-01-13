package comm.thread;

public class SImplethread extends Thread{
	
	
	public SImplethread(String str) {
		super(str);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i+ " thread name "+getName()+"\nPriority "+getPriority());
		}
		System.out.println("Done!"+getName());;
	}
	
	

}
