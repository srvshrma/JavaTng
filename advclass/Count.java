package comm.advclass;

public class Count {
private int serialNumber;
public static int counter=0;
public Count() {
	counter++;
	serialNumber=counter;
}
}
