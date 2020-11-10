package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import main.objects.Bike;
import main.objects.Car;
import main.objects.Van;
import main.objects.Veichle;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Veichle> Garage = new ArrayList<>();	
		
		
		Car carPorsche = new Car(4, 2);
		Bike bikeYamaha = new Bike(2, 2);
		Van vanMercedes = new Van(4, 6);
		Car carVauxhall = new Car(4, 5);
		
		Garage.add(carPorsche);
		Garage.add(bikeYamaha);
		Garage.add(vanMercedes);
		Garage.add(carVauxhall);
		
		//System.out.println(Garage.size());
		
		double totalPrice = 0;
		for(Veichle handle : Garage) {
			double cost = handle.getMaxNumberOfPassengers() * 3.13;
			totalPrice += cost;
			}
		totalPrice = BigDecimal.valueOf(totalPrice).setScale(3, RoundingMode.HALF_UP).doubleValue();
		
		System.out.println("The total bill for all Veichles parked here is: £" + totalPrice);
		
	}

}
