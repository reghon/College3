public class Mahasiswa{
	private String nrp;
	private String nama
	private String alamat;

	public Mahasiswa(String nrp, String nama, String alamat){
		this.nrp = nrp;
		this.nama = nama;
		this.alamat = alamat;
	}

	public String getNama(){
		return nama;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public void printInfo(){
		System.out.print("NRP : " + nrp);
		System.out.print("Nama : " + nama);
		System.out.print("Alamat : " + alamat);
	}
}