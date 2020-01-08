package comm.usinginterface;

public class TV extends Electronics {
	int size;
	

	public TV(double regularPrice, String manufacturer, int size) {
		super(regularPrice, manufacturer);
		this.size = size;
		
	}


	@Override
	public double computeSalePrice() {
		
		return super.getRegularPrice()*0.7;
	}






}
