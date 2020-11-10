package main.objects;

public class Car extends Veichle {
	//Attributes
	protected int numberOfDoors;
	protected boolean isSportsCar;
	protected boolean isElectricCar;
	
	//Constructor
	public Car() {
		super();
		this.numberOfWheels = 4;
	}
	
	public Car(int numberOfWheels, int maxNumberOfPassengers, int topSpeed, int price){
		super(numberOfWheels, maxNumberOfPassengers, topSpeed, price);
		this.isElectricCar = true;
		this.isSportsCar = true;
		this.numberOfDoors = 3;
	}
	
}
