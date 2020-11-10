package main;

import main.objects.Bike;
import main.objects.Car;
import main.objects.Garage;
import main.objects.Van;

public class Runner {

	public static void main(String[] args) {
		Garage parkingGarage = new Garage();
		
		
		
		Car carPorsche = new Car(4, 2);
		Bike bikeYamaha = new Bike(2, 2);
		Van vanMercedes = new Van(4, 6);
		Car carVauxhall = new Car(4, 5);
		
		parkingGarage.addVeichle(carPorsche);
		parkingGarage.addVeichle(bikeYamaha);
		parkingGarage.addVeichle(vanMercedes);
		parkingGarage.addVeichle(carVauxhall);
		
		parkingGarage.getBill();
		parkingGarage.removeVeichle(carVauxhall);
		parkingGarage.getBill();
		
		
		
	}

}
