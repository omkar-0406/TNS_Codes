package com.finalKeyword;

public class FinalVariable {
	//final keyword
	final int x = 100;
	
	final static int y = 10;
	
	void display() {
		//x = 11; cannot reassign final variable
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		System.out.println(y);
		
		FinalVariable fv = new FinalVariable();
		fv.display();
	}
}
