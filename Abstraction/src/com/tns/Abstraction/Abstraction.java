package com.tns.Abstraction;

abstract public class Abstraction {
	
	protected float calcus;
	
	//abstract method doesn't have a method body
	abstract void Calculation();
	
	//concrete method or non abstract method
	final void show() {
		System.out.println("Answer is: "+ calcus);
	}
	
}
