import java.util.Scanner;

public class TubeVolume{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan diameter tabung : ");
		double diameter = scanner.nextDouble();
	
		System.out.print("Masukkan tinggi tabung : ");
		double tinggi = scanner.nextDouble();

		Tube tabung1 = new Tube(diameter, tinggi);

		tabung1.calculateTubeVolume();
		
		tabung1.print();

		scanner.close();
	}
}