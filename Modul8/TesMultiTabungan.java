import java.util.Scanner;
public class TesMultiTabungan{
	public static void main(String args[]){
		boolean status;

		Scanner scanner = new Scanner(System.in);
		
		MultiTabungan multiTabungan = new MultiTabungan();

		System.out.println("SIMPAN MATA UANG");
		System.out.print("Masukkan mata uang [IDR/AUD/USD] : ");
		String mataUang = scanner.nextLine();

		System.out.print("Masukkan jumlah uang : ");
		int jumlah = scanner.nextInt();
		multiTabungan.simpanUang(jumlah, mataUang);

		scanner.nextLine();
		
		System.out.println("TARIK MATA UANG");
		System.out.print("Masukkan mata uang [IDR/AUD/USD] : ");
		mataUang = scanner.nextLine();

		System.out.print("Masukkan jumlah uang : ");
		jumlah = scanner.nextInt();

		status = multiTabungan.ambilUang(jumlah, mataUang);
		if (status)
			System.out.println("Ok");
		else
			System.out.println("Gagal");

		System.out.println("Sisa saldo = " + multiTabungan.getSaldo());			
	}
}	