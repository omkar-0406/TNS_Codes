package com.tns.Abstraction;

public class Substraction extends Abstraction{
	
	private int a;
	private int b;
	
	public Substraction(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	void Calculation() {
		super.calcus=a-b;
	}
	
}
