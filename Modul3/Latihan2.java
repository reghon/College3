import javax.swing.JOptionPane;
public class Latihan2{
	public static void main(String args[]) {
		int n, i;
		long jumlah = 1;

		String str = JOptionPane.showInputDialog("Masukkan bilangan factorial: ");
		n = Integer.parseInt(str);

		System.out.println("Bilangan Faktorial Anda adalah "+n);

		System.out.println("n\tn!");
		System.out.println("------------------");

		for(i = 1  ; i < n + 1 ; i++){
			jumlah *= i;
			System.out.printf("%d \t %d%n", i, jumlah);
		}
	}
}
			