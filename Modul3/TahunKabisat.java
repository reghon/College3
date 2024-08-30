
import java.util.Scanner;
public class TahunKabisat{
	public static void main(String args[]){
		int tahun, loop = 1;
		boolean kabisat = false;
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.printf("%nMasukkan tahun (1900 - 2005): ");
			tahun = scanner.nextInt();
			
			if(tahun < 1900){
				System.out.println("Maaf, tahun dibawah 1900");
			}
			else if(tahun > 2005){
				System.out.println("Maaf, tahun diatas 2005");
			}
		
			else{
				if(tahun % 4 == 0){
					kabisat = true;
				}
			
				if(tahun % 100 == 0){
					kabisat = false;
				}
				
				if(tahun % 400 == 0){
					kabisat = true;
				}
				
				if(kabisat){
					System.out.println(tahun+" adalah tahun kabisat");
				} else {
					System.out.println(tahun+" bukan tahun kabisat");
				}
			}


			
		}while( loop == 1);

		
		scanner.close();
	}
}