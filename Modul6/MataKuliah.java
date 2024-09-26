public class MataKuliah{
	private String kode;
	private String nama
	private String ruangan;

	public MataKuliah(String kode, String nama, String ruangan){
		this.kode = kode;
		this.nama = nama;
		this.ruangan= ruangan;
	}

	public String getNama(){
		return nama;
	}

	public void setRuangan(String ruangan){
		this.ruangan = ruangan;
	}

	public void printInfo(){
		System.out.print("Kode: " + kode);
		System.out.print("Nama : " + nama);
		System.out.print("Ruangan : " + ruangan);
	}
}