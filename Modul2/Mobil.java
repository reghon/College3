public class Mobil{
	String Nama, Merk, Warna, Tipe;
	int Berat, Seat;
	
	Mobil(String nama, String merk, String warna, String tipe, int berat, int seat){
	Nama = nama;
	Merk = merk;
	Warna = warna;
	Tipe = tipe;
	Berat = berat;
	Seat = seat;
	}

	void infoMobil(){
	System.out.println("Nama : " + Nama);
	System.out.println("Merk: " + Merk);
	System.out.println("Warna : " + Warna);
	System.out.println("Tipe : " + Tipe);
	System.out.println("Berat : " + Berat);
	System.out.println("Seat : " + Seat);
	}
}	