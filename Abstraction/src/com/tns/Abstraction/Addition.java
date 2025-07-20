package com.tns.Abstraction;

public class Addition extends Abstraction{

	private int x;
	private int y;
	
	
	
	public Addition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	@Override
	void Calculation() {
		super.calcus=x+y;
	}
	
	
}
