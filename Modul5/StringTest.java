public class StringTest {
    public static void main(String[] args) {
        // Menggunakan new String()
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("java");

        System.out.println(s1 == s2);        // false, karena s1 dan s2 adalah objek yang berbeda
        System.out.println(s1.equals(s2));   // true, karena nilai dari s1 dan s2 sama

        // Menggunakan literal string
        String s4 = "Java";
        String s5 = "Java";
        String s6 = "java";

        System.out.println(s4 == s5);        // true, karena s4 dan s5 adalah referensi yang sama dalam string pool
        System.out.println(s4.equals(s6));   // false, karena nilai dari s4 dan s6 berbeda
    }
}
