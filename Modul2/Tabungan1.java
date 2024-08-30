public class Tabungan{
	int saldo;
	public void ambilUang(int jumlah){
	saldo = saldo - jumlah;
	}
	Tabungan(int initsaldo){
	saldo = initsaldo;
	}
}
