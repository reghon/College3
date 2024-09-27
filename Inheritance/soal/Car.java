package Inheritance.soal;

public class Car extends Vehicle{
	private int numberOfDoors;
	
	public Car(String color){
		super(color);
		super.setModel("Car");
	}

	public void setNumberOfDoors(int numberOfDoors){
		this.numberOfDoors = numberOfDoors;	
	}

	public void displayCarInfo(){
		super.displayInfo();
		System.out.println("\nThis car has " + numberOfDoors + " doors");
	}

	
}