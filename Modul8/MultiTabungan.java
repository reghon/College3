public class MultiTabungan{
	private int saldo = 0;

	MultiTabungan(){
		this.saldo = saldo;
	}

	public int getSaldo(){
		return saldo;
	}
	
	public void simpanUang(int jumlah, String mataUang){
		int jumlahIdr = convertToIdr(jumlah, mataUang);
		saldo += jumlahIdr;
	}

	public boolean ambilUang(int jumlah , String mataUang){
		int jumlahIdr = convertToIdr(jumlah, mataUang);
		if(saldo < jumlah){
			return false;
		} else {
			saldo -= jumlahIdr;
			return true;	
		}
	}

	public int convertToIdr(int jumlah, String mataUang){
		switch(mataUang){
			case "IDR" : return jumlah;
		
			case "AUD" : return jumlah * 10000;

			case "USD" : return jumlah * 9000;
			
			default :    return 0;
		}
	}
		
}