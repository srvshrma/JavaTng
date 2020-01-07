package comm.advclass;

public abstract class Transport {
	public abstract double distance();
	public abstract double fuelEfficiency();

	private double startPoint;
	private double endPoint;
	private double travelled;
	private double totalFuel;
	private double usedFuel;
	private double efficiency;
	public double getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(double startPoint) {
		this.startPoint = startPoint;
	}
	public double getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(double endPoint) {
		this.endPoint = endPoint;
	}
	public double getTravelled() {
		return travelled;
	}
	public void setTravelled(double travelled) {
		this.travelled = travelled;
	}
	public double getTotalFuel() {
		return totalFuel;
	}
	public void setTotalFuel(double totalFuel) {
		this.totalFuel = totalFuel;
	}
	public double getUsedFuel() {
		return usedFuel;
	}
	public void setUsedFuel(double usedFuel) {
		this.usedFuel = usedFuel;
	}
	public double getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	@Override
	public String toString() {
		return "Transport startPoint=" + startPoint + ", endPoint=" + endPoint + ", travelled=" + travelled
				+ ", totalFuel=" + totalFuel + ", usedFuel=" + usedFuel + ", efficiency=" + efficiency;
	}
	
	
	
}
