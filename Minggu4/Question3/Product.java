public class Product{
	private String productName;
	private double price;

	public Product(String productName, double price){
		this.productName = productName;
		this.price = price;
	}

	public double getPrice(){
		return this.price;
	}
	
	public String getName(){
		return this.productName;
	}
	
}