package com.finalKeyword;

public class FinalMethod {
	
	public FinalMethod() {
		System.out.println("This is default constructor");
	}
	
	final int a = 50;
	
	final void show() {
		System.out.println("value is: " + a);
	}
}
