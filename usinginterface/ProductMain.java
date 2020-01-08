package comm.usinginterface;

public class ProductMain {

	public static void main(String[] args) {
		
		ProductInterface[] f=new Product[5];
		f[0]=new TV(1000,"SONY",30);
		f[1]=new TV(5000,"Samsu",50);
		f[2]=new mp3(1500,"Apple","Red");
		f[3]=new Book(150,"Minion",2012);
		f[4]=new Book(100,"AmericanPie",2013);

		double totalRegularPrice = 0;
        double totalSalePrice = 0;
        
        for (int i=0; i<f.length; i++){
            
            // Call a method of the super class to get
            // the regular price.
            totalRegularPrice += f[i].getRegularPrice();
            
            // Since the sale price is computed differently
            // depending on the product type, overriding (implementation)
            // method of the object instance of the sub-class
            // gets invoked.  This is runtime polymorphic
            // behavior.
            totalSalePrice += f[i].computeSalePrice();
            
            System.out.println("Item number " + i +
                    ": Type = " + f[i].getClass().getName() +
                    ", Regular price = " + f[i].getRegularPrice() +
                    ", Sale price = " + f[i].computeSalePrice());
        }
        System.out.println("totalRegularPrice = " + totalRegularPrice);
        System.out.println("totalSalePrice = " + totalSalePrice);
	}

}
