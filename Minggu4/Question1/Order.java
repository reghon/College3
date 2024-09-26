public class Order{
	private OrderItem []orderItems;
	private int orderAmount = 0;
	private int total;

	public Order(){
		this.orderItems = new OrderItem[10];
	}
	
	public void addOrderItem(OrderItem item){
		this.orderItems[orderAmount] = item;
		orderAmount++;
	}

	public int calculateTotal(){
		total = 0;
		for (int i = 0 ; i < orderAmount ; i++){
			total += orderItems[i].getTotalPrice();
		}
		
		return total;	
	}
		
}
	
	
