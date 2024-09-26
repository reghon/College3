public class Alarm{
	public String id;
	public String description;
	public String date;
	public String time;

	public void run(){
		System.out.print("Alarm berbunyi");
	}

	public void terminate(){
		System.out.print("Alarm berhenti");
	}

	public void snooze(){
		System.out.print("Alarm ditunda");
	}
}