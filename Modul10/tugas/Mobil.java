public class Mobil extends Kendaraan{
	protected String bahanBakar;	
	protected int kapasitasMesin;

	public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin){
		Kendaraan(int jmlRoda, String warna);
		this.bahanBakar = bahanBakar;
		this.kapasitasMesin = kapasitasMesin;		
	}

	public setBahanBakar(String bahanBakar){
		this.bahanBakar = bahanBakar;
	}

	public String getBahanBakar(){
		return bahanBakar;
	}

	public setKapasitasMesin(int kapasitasMesin){
		this.kapasitasMesin = kapasitasMesin;
	}

	public int getKapasitasMesin(){
		return kapasitasMesin;
	}
}