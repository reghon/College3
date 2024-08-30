import java.util.Scanner;
public class FibonacciArray{
	public static void main(String args[]){
		int x = 0, y = 1, z;
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Masukkan jumlah deretan Fibonacci: ");
		int n = scanner.nextInt();

		int[] fibonacci = new int[n];

		for (int i = 0 ; i < n ; i++){
			fibonacci[i] = x;	
			z = x + y;
			y = x;
			x = z;
		}

		for(int i = 0 ; i < n ; i++){
			System.out.printf(fibonacci[i]+" ");
		}
		
		scanner.close();
	}
}

	

	