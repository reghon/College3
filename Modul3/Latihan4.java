public class Latihan4{
	public static void main(String args[]) {
		int jumlah = 2, i = 0;

		while(jumlah < 21){
			if(jumlah % 6 != 0){
				System.out.printf("%d ", jumlah);
			}
			jumlah += 2;
			i++;
		}
	}
}
			