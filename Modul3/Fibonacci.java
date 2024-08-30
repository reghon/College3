import javax.swing.JOptionPane;
public class Fibonacci{
	public static void main(String args[]) {
		int n;

		String str = JOptionPane.showInputDialog("Masukkan berapa deret fibonacci: ");
		n = Integer.parseInt(str);

		System.out.println(n+" Bilangan Fibonacci Pertama adalah");
		printFibonacci(n);
	}


	public static void printFibonacci(int n){
		int x = 0, y = 1, z;
		int nOutput = 0;
		
		for(int i = 0 ; nOutput < n ; i++){
			z = x + y;

			System.out.printf(y+" ");

			x = y;
			y = z;
			nOutput++;
		}
	}
}
			