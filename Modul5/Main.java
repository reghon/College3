// Kelas untuk mengonversi string
class StringConverter {
    private String inputString;

    // Konstruktor untuk inisialisasi input string
    public StringConverter(String inputString) {
        this.inputString = inputString;
    }

    // Metode untuk melakukan konversi
    public String convert() {
        // Menghilangkan spasi di awal dan akhir string
        String trimmedString = inputString.trim();
        
        // Jika string kosong, kembalikan string kosong
        if (trimmedString.isEmpty()) {
            return trimmedString;
        }
        
        // Menentukan huruf pertama dan terakhir dari keseluruhan string
        char firstChar = trimmedString.charAt(0);
        char lastChar = trimmedString.charAt(trimmedString.length() - 1);

        // Membuat StringBuilder untuk hasil
        StringBuilder result = new StringBuilder();
        
        // Mengubah string sesuai dengan aturan
        for (char c : trimmedString.toCharArray()) {
            if (c == firstChar) {
                result.append(lastChar);
            } else if (c == lastChar) {
                result.append(firstChar);
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Contoh string input
        String inputString = "Amanda Ace";
        
        // Membuat instance dari StringConverter
        StringConverter converter = new StringConverter(inputString);
        
        // Mendapatkan hasil konversi
        String result = converter.convert();
        
        // Menampilkan hasil
        System.out.println("String masukan : " + inputString);
        System.out.println("String hasil : " + result);
    }
}
