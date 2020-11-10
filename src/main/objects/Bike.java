package main.objects;

public class Bike extends Veichle{
	//Attributes
	protected boolean hasSideCar;
	protected boolean isSportsBike;
	protected final boolean isACOn = false;
	
	//Constructors
	public Bike() {
		super();
	}
	
	public Bike(int numberOfWheels, int maxNumberOfPassengers) {
		super(numberOfWheels, maxNumberOfPassengers);
		this.hasSideCar = false;
		this.isSportsBike = true;
	}
	
	//Methods
	public boolean doWheelie() {
		if(isSportsBike == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		return "Bike [hasSideCar=" + hasSideCar + ", isSportsBike=" + isSportsBike + ", isACOn=" + isACOn
				+ ", maxNumberOfPassengers=" + maxNumberOfPassengers + "]";
	}

	//Getters and Setters
	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	public boolean isSportsBike() {
		return isSportsBike;
	}

	public void setSportsBike(boolean isSportsBike) {
		this.isSportsBike = isSportsBike;
	}
	
	public boolean isACOn() {
		return isACOn;
	}
	
	
}
