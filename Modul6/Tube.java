public class Tube{
	double diameter, volume, height;
	
	Tube(double diameter, double height){
		this.diameter = diameter;
		this.height = height;
	}
	
	public void calculateTubeVolume(){
		volume = 3.14 * diameter * height;
	}
	
	public void print(){
		System.out.print("Tube Volume : " + volume);
	}
}