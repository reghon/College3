public class Reservation{
	private Room room;
	private Guest guest;
	private int numberOfNights;
	
	public Reservation(Room room, Guest guest, int numberOfNights){
		this.room = room;
		this.guest = guest;
		this.numberOfNights = numberOfNights;
	}

	public double calculateTotalPrice(){
		return room.getPrice() * numberOfNights;
	}
	
}