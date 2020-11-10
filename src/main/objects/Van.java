package main.objects;

public class Van  extends Veichle{
	//Attributes
	protected String vanSize;
	protected boolean isPickup;
	
	
	//Constructors
	public Van(int numberOfWheels, int maxNumberOfPassengers) {
		super(numberOfWheels, maxNumberOfPassengers);
		this.vanSize = "Medium";
		this.isPickup = true;
	}

	//Methods
	public String getVanSize() {
		return vanSize;
	}


	public void setVanSize(String vanSize) {
		this.vanSize = vanSize;
	}


	public boolean isPickup() {
		return isPickup;
	}


	public void setPickup(boolean isPickup) {
		this.isPickup = isPickup;
	}
	
	
}
