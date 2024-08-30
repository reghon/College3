public class LatihanMean{
	public static void main(String args[]){

		Mahasiswa array_Mahasiswa[] = new Mahasiswa[4];
		array_Mahasiswa[0] = new Mahasiswa(1, "Ahmad", 81, 90, 62);
		array_Mahasiswa[1] = new Mahasiswa(2, "Adang", 50, 83, 87);
		array_Mahasiswa[2] = new Mahasiswa(3, "Dani", 89, 55, 65);
		array_Mahasiswa[3] = new Mahasiswa(4, "Edi", 77, 70, 92);
		
		System.out.printf("NRP\tRata-rata%n");
		System.out.println("--------------------");		

		for(int i = 0 ; i < 4 ; i++){
			System.out.printf("%d\t%.2f%n",array_Mahasiswa[i].NRP, array_Mahasiswa[i].getMean());
		}
	}	
}