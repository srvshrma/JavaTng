package comm.thread;

public class ThreadGroup extends Thread {
	public ThreadGroup(String str) {
		super(str);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep((long) (Math.random() * 1000));

			} catch (InterruptedException e) {

			}
		}
		System.out.format(" Done!! %d", getName());

	}

}
