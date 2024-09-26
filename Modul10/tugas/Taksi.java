public class Taksi extends Mobil{
	protected int tarifAwal;	
	protected int tarifPerKm;
	
	public setTarifAwal(int tarifAwal){
		this.tarifAwal = tarifAwal;
	}

	public int getTarifAwal(){
		return tarifAwal;
	}

	public setTarifPerKm(int tarifPerKm){
		this.tarifPerKm = tarifPerKm;
	}

	public int getTarifPerKm(){
		return tarifPerKm;
	}
}