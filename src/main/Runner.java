package main;

import main.objects.Car;

public class Runner {

	public static void main(String[] args) {
		Car carOne = new Car(4, 130, 100);
		System.out.println(carOne.getPrice());
	}

}
