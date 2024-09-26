import java.util.Scanner;

public class SwapFamilyName{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("String first person name : ");
		String[] name1 = scanner.nextLine().split(" ", 2);
		FullName person1 = new FullName(name1[0], name1.length > 1 ? name1[1] : "");

		System.out.print("String second person name : ");
		String[] name2 = scanner.nextLine().split(" ", 2);
		FullName person2 = new FullName(name2[0], name2.length > 1 ? name2[1] : "");

		person1.swapFamilyName(person2);

		System.out.println("First person: " + person1.getFullName());
		System.out.println("Second person : " + person2.getFullName());

		scanner.close();
	}
}