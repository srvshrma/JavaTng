package comm.thread;

	public class HelloRunner implements Runnable{

		@Override
		public void run() {
			for(int i=0;i<20;i++)
			{
				System.out.format(" %d",i);
			}
		}
		
}
