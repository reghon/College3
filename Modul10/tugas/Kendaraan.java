public class Kendaraan{
	protected int jmlRoda;
	protected String warna;

	public Kendaraan(int jmlRoda, String warna){
		this.jmlRoda = jmlRoda;
		this.warna = warna;		
	}	

	public setJmlRoda(int jmlRoda){
		this.jmlRoda = jmlRoda;
	}

	public int getJmlRoda(){
		return jmlRoda;
	}

	public setWarna(String warna){
		this.warna = warna;
	}

	public getWarna(){
		return warna;
	}
}