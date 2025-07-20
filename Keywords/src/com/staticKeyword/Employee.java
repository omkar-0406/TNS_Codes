package com.staticKeyword;

public class Employee {
	
	private int emid;
	private String name;
	
	//static variable
	static String companyName = "Google"; //constant value
	
	
	
	public Employee(int emid, String name) {
		super();
		this.emid = emid;
		this.name = name;
		
	}



	public void empData() {
		System.out.println("Employee Id: "+ emid);
		System.out.println("Employee Name: "+name );
		System.out.println("Company Name: "+ companyName);
	}
}
