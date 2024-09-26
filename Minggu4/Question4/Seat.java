public class Seat{
	private String seatNumber;
	private boolean isAvailable;

	public Seat(String seatNumber, boolean isAvailable){
		this.seatNumber = seatNumber;
		this.isAvailable = isAvailable;
	}

	public boolean isAvailable(){
		return isAvailable;
	}

	public void setSeat(boolean isAvailable){
		this.isAvailable = isAvailable;
	}
	
}