package Inheritance.soal;

public class Motorcycle extends Vehicle{
	private boolean hasSideCar;
	
	public Motorcycle(String color){
		super(color);
		super.setModel("Motorcycle");
		hasSideCar = false;
	}

	public void displayMotorcycleInfo(){
		super.displayInfo();
		if(hasSideCar)
			System.out.println("\nThis car has a side car");
		else
			System.out.println("\nThis car does not have side car");
	}

	
}