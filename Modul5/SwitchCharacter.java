import java.util.Scanner;

public class SwitchCharacter{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan string : ");
		String str = scanner.nextLine();
	
		str = switchChar(str);

		System.out.print("Hasil string : " + str);

		scanner.close();

	}

	
	public static String switchChar(String str){
		if(str.length() < 2 || str == null){
			return str;
		}	
		str = str.toLowerCase();

		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);

		String temp = str.replace(firstChar, '*');		
		temp = temp.replace(lastChar, firstChar);
		temp = temp.replace('*'	, lastChar);

		return temp;
	}	
}