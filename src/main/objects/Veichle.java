package main.objects;

public class Veichle {
	//Attributes
	protected int numberOfWheels;
	protected int topSpeed;
	protected boolean isEngineEngaged;
	protected boolean isACOn = false;
	protected int price;
	protected int maxNumberOfPassengers;

	//Constructors
	public Veichle() {
		super();
	}
	
	public Veichle(int numberOfWheels, int maxNumberOfPassengers, int topSpeed, int price){
		super();
		this.numberOfWheels = numberOfWheels;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		this.topSpeed = topSpeed;
		this.price = price;
		this.isEngineEngaged = false;
	}
	
	//Methods
	public void start() {
		this.isEngineEngaged = true;
	}
	
	public void toggleAC() {
		if(this.isACOn = false) {
			this.isACOn = true;
		} else {
			this.isACOn = false;
		}
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void honkHorn() {
		System.out.println("HOOOOOONK");
	}
	
	
}
