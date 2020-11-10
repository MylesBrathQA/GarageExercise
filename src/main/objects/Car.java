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
	
	public Car(int numberOfWheels, int maxNumberOfPassengers){
		super(numberOfWheels, maxNumberOfPassengers);
		this.isElectricCar = true;
		this.isSportsCar = true;
		this.numberOfDoors = 3;
		
	}

	//Methods
	@Override
	public String toString() {
		return "Car [numberOfDoors=" + numberOfDoors + ", isSportsCar=" + isSportsCar + ", isElectricCar="
				+ isElectricCar + ", maxNumberOfPassengers=" + maxNumberOfPassengers + "]";
	}
	
}
