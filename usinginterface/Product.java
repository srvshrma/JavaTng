package comm.usinginterface;

public abstract class Product implements ProductInterface
{
	private double regularPrice;



	public Product(double regularPrice) {
		super();
		this.regularPrice = regularPrice;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}
	
	public abstract double computeSalePrice();

}
