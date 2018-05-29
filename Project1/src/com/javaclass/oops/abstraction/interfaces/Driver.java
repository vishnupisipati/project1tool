package com.javaclass.oops.abstraction.interfaces;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v2.printNumberOfWheels();
		v2.printNumberOfGears();

	}

}
