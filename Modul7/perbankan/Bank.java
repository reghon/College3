package perbankan;

public class Bank{
	private Nasabah[] nasabah;
	private int jumlahNasabah = 0;

	public Bank(){
		this.nasabah = new Nasabah[10];
	}

	public void tambahNasabah(String namaAwal, String namaAkhir){
		nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
		jumlahNasabah++;
	}

	public int getJumlahNasabah(){
		return jumlahNasabah;
	}

	public Nasabah getNasabah(int indeks){
		return nasabah[indeks];
	}
}