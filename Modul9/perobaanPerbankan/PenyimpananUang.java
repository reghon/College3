package percobaanPerbankan;

public class PenyimpananUang extends Tabungan{
	private double tingkatBunga;

	public PenyimpananUang(double saldo, double tingkatBunga){
		this.saldo = saldo + (saldo * tingkatBunga);
	}

	public double cekUang(){
		return saldo;
	}
}