public class Dosen{
	private String nip;
	private String nama
	private String departemen;

	public Dosen(String nip, String nama, String alamat){
		this.nip = nip;
		this.nama = nama;
		this.departemen = departemen;
	}

	public String getNama(){
		return nama;
	}

	public void setDepartemen(String departemen){
		this.departemen = departemen;
	}

	public void printInfo(){
		System.out.print("NIP : " + nip);
		System.out.print("Nama : " + nama);
		System.out.print("Departemen : " + departemen);
	}
}