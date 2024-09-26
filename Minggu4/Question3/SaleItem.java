public class SaleItem{
	private Product product;
	private int quantity;
	
	public SaleItem(Product product, int quantity){
		this.product = product;
		this.quantity = quantity;
	}
	
	public double getTotalPrice(){
		return product.getPrice() * quantity;
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public void printInfo(){
		System.out.println("Barang yang dibeli : " + this.product.getName());
		System.out.println("Jumlahnya : " + this.getQuantity());
	}
}
