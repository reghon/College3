package Inheritance.soal;

public class Vehicle{
	private String model;
	private int year;
	private String color;

	public Vehicle(String color){
		this.color = color;
	}

	public void setYear(int year){
		if(2025 > year && year > 1800){
			this.year = year;
			System.out.println("\n" + model + "'s year saved");
		}else 
			System.out.println("\nFailed to save " + model + "'s year. Year must be less than 2025 and more than 1800");
	}

	public void setModel(String model){
		this.model = model;
	}

	public void displayInfo(){
		System.out.println("\n>>Vehicle Info:");
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Color: " + color);
	}
}