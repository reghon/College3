public class Room{
	private String roomNumber;
	private double pricePerNight;

	public Room(String roomNumber, double pricePerNight){
		this.roomNumber = roomNumber;
		this.pricePerNight = pricePerNight;
	}

	public double getPrice(){
		return pricePerNight;
	}
}