public class Mahasiswa{
	int NRP, RPL, BD, PBO;
	double mean;
	String nama;

	Mahasiswa(int NRP, String nama, int RPL, int BD, int PBO){
		this.NRP = NRP;
		this.nama = nama;
		this.RPL = RPL;
		this.BD = BD;
		this.PBO = PBO;		
	}

	double getMean(){
		mean = (RPL + BD + PBO) / 3.0;
		return mean;
	}
}