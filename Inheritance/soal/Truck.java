package Inheritance.soal;

public class Truck extends Vehicle{
	private int cargoCapacity;
	
	public Truck(String color){
		super(color);
		super.setModel("Truck");
	}

	public void setCargoCapacity(int cargoCapacity){
		this.cargoCapacity = cargoCapacity;	
	}

	public void displayTruckInfo(){
		super.displayInfo();
		System.out.println("\nThis truck can hold " + cargoCapacity + " tons");
	}

	
}