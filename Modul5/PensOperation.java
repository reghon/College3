public class PensOperation{
	public static void main(String Args[]){
		String str = "Selamat Datang di PENS";
		int pilihan;

		System.out.println("String : " + str);
		System.out.println("1. Huruf kapital : " + str.toUpperCase());
		System.out.println("2. Huruf kecil : " + str.toLowerCase());
		System.out.println("3. Panjang string : " + str.length());
		System.out.println("4. Index PENS : " + str.indexOf("PENS"));
	}
}