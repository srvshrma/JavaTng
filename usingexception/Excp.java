package comm.usingexception;

public class Excp {

	public static void main(String[] args) {
		 new Excp().doTheWork();
		
	}
		 public void doTheWork() {
		        Object o = null;
		        
		        for (int i=0; i<5; i++) {
		            try {
		                o = makeObj(i);
		            } catch (IllegalArgumentException e) {
		            	e.printStackTrace();
		                System.err.println("IllegalArgumentException is caught: (" + e.getMessage() + ").");
		                return;    // cut off println below if makeObj failed.
		            }
		            System.out.println(o);  // process the created object in some way
		        }
		
	}
		private Object makeObj(int type) throws IllegalArgumentException{
			if (type == 1)  // detects an error...
	            throw new IllegalArgumentException("Don't like type " + type);
	        return new Object();
		}
}
