public class Truk{
	private double muatan;
	private double muatanmaks;

	Truk(double beratmaks){
		muatan = 0;
		muatanmaks = beratmaks;
	}

	public double getMuatan(){
		return muatan;
	}

	public double getMuatanMaks(){
		return muatanmaks;
	}

	public boolean tambahMuatan(double berat){
		if(this.muatan + berat < muatanmaks){
			muatan += berat;
			return true;
		} else {
			return false;
		}
	}

	public double newtsToKilo(double berat){
		return berat /= 9.8;
	}

	public double kiloToNewts(double berat){
		return berat *= 9.8;
	}
}