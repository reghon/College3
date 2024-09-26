public class Kalender{
	private int tanggal;
	private int bulan;
	private int tahun;

	Kalender(int tanggal){
		this.tanggal = tanggal;
		bulan = 1;
		tahun = 2000;
	}

	Kalender(int bulan, int tahun){
		tanggal = 1;
		this.bulan = bulan;
		this.tahun = tahun;
	}
	
	Kalender(int tanggal, int bulan, int tahun){
		this.tanggal = tanggal;
		this.bulan = bulan;
		this.tahun = tahun;
	}

	public int getTanggal(){
		return tanggal;
	}
	
	public int getBulan(){
		return bulan;
	}

	public int getTahun(){
		return tahun;
	}

	public void setTanggal(int tanggal){
		this.tanggal = tanggal;
	}
	
	public void setBulan(int bulan){
		this.bulan = bulan;
	}

	public void setTahun(int tahun){
		this.tahun = tahun;
	}
}