package main.objects;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Garage {
	//Attribute
	private ArrayList<Veichle> itemsInGarage = new ArrayList<>();
	private String name;
	
	//Constructor
	public Garage() {
		
	}
	
	public Garage(String name) {
		this.name = name;
	}
	
	//Methods
	
	public void addVeichle(Veichle item) {
		this.itemsInGarage.add(item);
	}
	
	public void removeVeichle(Veichle item) {
		this.itemsInGarage.remove(item);
	}
	
	public void listVeichles() {
		
		for (Veichle handle : itemsInGarage) {
			handle.toString();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBill() {
		double totalPrice = 0;
		for(Veichle handle : itemsInGarage) {
			double cost = handle.getMaxNumberOfPassengers() * 3.13;
			totalPrice += cost;
			}
		totalPrice = BigDecimal.valueOf(totalPrice).setScale(3, RoundingMode.HALF_UP).doubleValue();
		
		System.out.println("The total bill for all Veichles parked here is: £" + totalPrice);
		return totalPrice;
	}
}
