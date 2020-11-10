package main;

import java.util.ArrayList;

import main.objects.Bike;
import main.objects.Car;
import main.objects.Van;
import main.objects.Veichle;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Veichle> Garage = new ArrayList<>();	
		
		
		Car carPorsche = new Car(4, 2, 150, 20);
		Bike bikeYamaha = new Bike(2, 2, 160, 12);
		Van vanMercedes = new Van(4, 6 , 100, 25);
		
		Garage.add(carPorsche);
		Garage.add(bikeYamaha);
		Garage.add(vanMercedes);
		
		//System.out.println(Garage.size());
		
		int sum = 0;
		for(Veichle handle : Garage) {
			sum += handle.getPrice();
			System.out.println(sum);
			}
		
		System.out.println("The total bill for all Veichles parked here is: £" + sum);
		
	}

}
