package com.dp.creational.abstractfactory;

public class SmallCar extends Car {
	public SmallCar(Location location) {
		super(CarType.SMALL, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building luxury car");
		// add accessories
	}
}
