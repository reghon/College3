public class Tabungan{
	int saldo;

	Tabungan(int initsaldo){
	saldo = initsaldo;
	}

	int getSaldo(){
		return saldo;
	}

	void simpanUang(int jumlah){
		saldo += jumlah;
	}

	boolean ambilUang(int jumlah){
	if(saldo < jumlah)
		return false;
	else
		saldo -= jumlah;
		return true;
	}
}