public class Transaction{
	private SaleItem []saleItems;	
	private int transactionAmount = 0;
	private int totalRevenue;

	public Transaction(){
		this.saleItems = new SaleItem[10];
	}
	
	public void addSaleItem(SaleItem item){
		this.saleItems[transactionAmount] = item;
		transactionAmount++;
	}

	public int calculateTotalRevenue(){
		totalRevenue = 0;
		for (int i = 0 ; i < transactionAmount ; i++){
			saleItems[i].printInfo();
			totalRevenue += saleItems[i].getTotalPrice();
		}
		
		return totalRevenue;
	}

	
}