public class Truk{
	double muatan, muatanmaks;
	
	Truk(double beratmaks){
		muatanmaks = beratmaks;
	}

	double getMuatanMaks(){
		return muatanmaks;
	}	 

	double getMuatan(){
		return muatan;
	}

	double tambahMuatan(double berat){
		if(muatan + berat < muatanmaks){
		muatan += berat;
		}
		return muatan;
	}
}