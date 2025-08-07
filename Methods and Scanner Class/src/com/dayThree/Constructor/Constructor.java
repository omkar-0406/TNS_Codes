package com.dayThree.Constructor;

public class Constructor {
	
	//Default Constructor
	public Constructor() {
		System.out.println("Default Constructor");
	}
	
	public Constructor(int id, String name, int age) {
		System.out.println("Parameterized Constructor");
		System.out.println(id + " "+ name + " "+ age);
	}
	
	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor(3028, "Omkar", 20);
	}

}
