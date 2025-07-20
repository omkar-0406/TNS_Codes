package com.tns.Abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Addition add = new Addition(5,6);
		add.Calculation();
		add.show();
		
		Substraction sub = new Substraction(9,5);
		sub.Calculation();
		sub.show();
		
	}

}
