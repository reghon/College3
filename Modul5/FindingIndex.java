import java.util.Scanner;
import java.util.ArrayList;

public class FindingIndex{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kalimat : ");
		String str = scanner.nextLine();
		
		System.out.print("Karakter : ");
		char ch = scanner.next().charAt(0);	

		ArrayList<Integer> index = findCharacter(str, ch);

		if(index.isEmpty()){
			System.out.println("Karakter tidak ditemukan dalam kalimat.");
		} else {
			System.out.print("Karakter " + ch + " terdapat pada index: ");
			for(int loop : index){
				System.out.print(loop + " 	");
			} 
		}

		scanner.close();
	}

	public static ArrayList<Integer> findCharacter(String str, char ch){
		ArrayList<Integer> found = new ArrayList<>();

		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) == ch){
				found.add(i);
			}
		}
		return found;
	}
}