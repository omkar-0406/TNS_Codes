package com.HierarchicalInheritance;

public class Hierarchical {

	public static void main(String[] args) {
		
		bike b = new bike();
		b.engine();
		b.GearType();
		
		Car c = new Car();
		c.speed(); 
		c.fueltype();
	}

}
