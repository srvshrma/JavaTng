package comm.usinginterface;

public class Book extends Product {
	private String publisher;
	private int publishedYear;
	

	public Book(double regularPrice, String publisher, int publishedYear) {
		super(regularPrice);
		this.publisher = publisher;
		this.publishedYear = publishedYear;
		
	}


	@Override
	public double computeSalePrice() {
		
		return super.getRegularPrice()*0.5;
		
	
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getPublishedYear() {
		return publishedYear;
	}


	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}


	

	
}
