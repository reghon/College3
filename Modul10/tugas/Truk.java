public class Truk extends Mobil{
	protected int muatanMaks;
	
	public Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks){
		Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin);
		this.muatanMaks = muatanMaks;		
	}
	public setMuatanMaks(int muatanMaks){
		this.muatanMaks = muatanMaks;
	}

	public int getMuatanMaks(){
		return muatanMaks;
	}
}