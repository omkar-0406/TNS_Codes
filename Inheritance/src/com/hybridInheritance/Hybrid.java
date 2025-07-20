package com.hybridInheritance;

public class Hybrid {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.aadharno = 9876543210l;
		e.info();
		
		Client c = new Client();
		c.name = "Rajesh";
		c.Company();
		
		Manager m = new Manager();
		m.mobno = 9876543000L;
		m.developer();
		m.info();
	}

}
