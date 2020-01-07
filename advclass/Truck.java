package comm.advclass;

public class Truck extends Transport {
	
	public double Tr(double startPoint,double endPoint,double totalFuel,double usedFuel) {
		double left;
		double travelled;
		travelled=endPoint-startPoint;
		left=totalFuel-usedFuel;
		double efficiency = (left)/(travelled);
		return efficiency;
		
	}
	
	@Override
	public double fuelEfficiency() {
		return 0;
	}




	
	@Override
	public double distance() {
		return 0;
	}


}
