package comm.usinginterface;

public class mp3 extends Electronics {
	private String color;

	public mp3(double regularPrice, String manufacturer, String color) {
		super(regularPrice, manufacturer);
		this.color = color;
	}

	@Override
	public double computeSalePrice() {
		
		return super.getRegularPrice()*0.8;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	


	
}
