package com.javaclass.oops.abstraction.abstractclass;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.fillGas();
		v1.printNumberOfGears();
		v1.printNumberOfWheels();
		v2.fillGas();
		v2.printNumberOfGears();
		v2.printNumberOfWheels();

	}

}
