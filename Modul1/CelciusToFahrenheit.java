import javax.swing.JOptionPane;
public class CelciusToFahrenheit {
	public static void main(String args[]) {
		double nilai, fahrenheit;
		String str = JOptionPane.showInputDialog("Masukkan nilai :");
		nilai = Integer.parseInt(str);
		fahrenheit = nilai*1.8 + 32;
		System.out.println("Suhu dalam celcius : " + nilai);
		System.out.println("Suhu dalam fahrenheit : " + fahrenheit);
	}
}