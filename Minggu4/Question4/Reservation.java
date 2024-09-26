public class Reservation{
	private String reservationId;
	private Movie movie;
	private Seat seat;

	public Reservation(String reservationId, Movie movie, Seat seat){
		this.reservationId = reservationId;
		this.movie = movie;
		this.seat = seat; 
	}

	public void reserveSeat(){
		seat.setSeat(false);
	}
}
