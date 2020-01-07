package comm.advclass;

public class Sedan extends Car {
	private boolean isAcEnabled;
	
	public Sedan(String carModel,String carColor,double carPrice,boolean isAcEnabled) {
		super();
		setModel(carModel);
		setCarColor(carColor);
		setCarPrice(carPrice);
		this.isAcEnabled = isAcEnabled;
	}

	@Override
	public void accelerateCar() {
		// TODO Auto-generated method stub
System.out.println("Sedan is moving..");
	}

	@Override
	public void breakCar() {
		// TODO Auto-generated method stub
System.out.println("Sedan is slowing down..");
	}

	@Override
	public String toString() {
		return super.toString()+"Sedan [isAcEnabled=" + isAcEnabled + "]";
	}

}
