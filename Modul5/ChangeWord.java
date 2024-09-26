import java.util.Scanner;

public class ChangeWord{
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);

		System.out.print("String kalimat utama : ");
		String sentence = scanner.nextLine();
	
		System.out.print("String yang ingin diganti : ");
		String findWord = scanner.nextLine();
	
		System.out.print("String pengganti : ");
		String substituteWord = scanner.nextLine();

		Sentence mainSentence = new Sentence(sentence);
	
		mainSentence.swap(findWord, substituteWord);
	
		System.out.print("Kalimat utama menjadi : " + mainSentence.getSentence());		
	
		scanner.close();	
	}
}