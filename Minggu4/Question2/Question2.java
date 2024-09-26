public class Question2{
	public static void main(String args[]){
		Room room = new Room("101", 500000);
		Guest guest = new Guest("John Doe");
		Reservation reservation = new Reservation(room, guest, 3);

		System.out.println("Total Harga reservasi: " + reservation.calculateTotalPrice());
	}
}