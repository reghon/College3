package perbankan;

public class PengambilanUang extends Tabungan{
	private int proteksi;

	public PengambilanUang(int saldo){
		this.saldo = saldo;
	}

	public PengambilanUang(int saldo, int proteksi){
		this.saldo = saldo;
		this.proteksi = proteksi;
	}

	public int getSaldo(){
		return saldo;
	}

	public boolean ambilUang(int jumlah){
		if(jumlah < (saldo - proteksi)){
			saldo -= jumlah;
			return true;
		} else {
			return false;
		}
	}
}