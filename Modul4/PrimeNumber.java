import java.util.Scanner;
public class PrimeNumber{
	public static void main(String args[]){
		boolean is_prime = true;
		Scanner scanner = new Scanner(System.in);
	
		System.out.printf("Masukkan bilangan : ");
		int n = scanner.nextInt();
		scanner.close();

		
		if(n <=1 ){
			is_prime = false;
		} else {
			for(int i = 2 ; i < n ; i++){
				if(n % i == 0){
					is_prime = false;
				}
			}
		}
	
		if(is_prime){
			System.out.println(n+" adalah bilangan prima");
		} else {
			System.out.println(n+" bukan bilangan prima");
		}
	}
}


	
	