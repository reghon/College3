public class Shape{
	public double length, width, height, volume;
	
	public Shape(double length, double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
		calculateVolume();
	}

	public double compareTo(Shape shape){
		return this.volume - shape.volume;
	}

	private void calculateVolume(){
		volume = length * width * height;
	}

	public void cetak(){
		System.out.println(volume + "");
	}
}	