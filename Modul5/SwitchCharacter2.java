import java.util.Scanner;

public class SwitchCharacter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan string: ");
        String str = scanner.nextLine();

        str = switchBeginWithEnd(str);

        System.out.println("Hasil string: " + str);

        scanner.close();
    }

    public static String switchBeginWithEnd(String str) {
        if (str.length() <= 1) {
            return str; // No change needed for strings of length 0 or 1
        }

        char begin = str.charAt(0);
        char end = str.charAt(str.length() - 1);

        // Use StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == begin) {
                result.append(end);
            } else if (currentChar == end) {
                result.append(begin);
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
