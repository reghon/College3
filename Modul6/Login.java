import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new User
        System.out.println("BUAT AKUN BARU");
        System.out.print("Masukkan username baru : ");
        String username = scanner.nextLine();
        
        System.out.print("Masukkan password baru : ");
        String password = scanner.nextLine();
        
        User user1 = new User(username, password);

        // Login process
        System.out.println("LOGIN AKUN");
        System.out.print("Masukkan username anda : ");
        username = scanner.nextLine();
        
        System.out.print("Masukkan password anda : ");
        password = scanner.nextLine();

        // Check login
        if (user1.login(username, password)) {
            System.out.println("Anda telah login");
        } else {
            System.out.println("Informasi Invalid");
        }
        
        scanner.close();
    }
}
