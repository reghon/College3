import java.io.IOException;

class SwitchName {
    public static void main(String[] args) {
        char firstInitial = ' ';
        System.out.println("Masukkan huruf awal nama anda:");
        
        try {
            // Membaca karakter dari input pengguna
            firstInitial = (char)System.in.read();
            // Mengabaikan karakter newline
            System.in.read(); 
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        }
        
        switch (firstInitial) {
            case 'a':
                System.out.println("Nama anda pasti Asep!");
                break;
            case 'b':
                System.out.println("Nama anda pasti Brodin!");
                break;
            case 'c':
                System.out.println("Nama anda pasti Cecep!");
                break;
            default:
                System.out.println("Nama anda tidak terkenal!");
                break;
        }
    }
}
