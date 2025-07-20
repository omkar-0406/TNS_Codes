package com.staticKeyword;

public class StaticClass {
	
	private int section;
	static int srNo = 100;
	
	//block of code(without method), it can't run without object.
	{
		System.out.println("Block of code");
	}
	
	//static block, it run without object 
	static {
		System.out.println("Static Block");
	}
	
	void data() {
		System.out.println("Non-Static Method");
		System.out.println(srNo);
		System.out.println(section);
	}
	
	static void display() {
		System.out.println("Static Method");
		System.out.println(srNo);
		//non-static variable not allowed 
	}
	
	
	
	public static void main(String[] args) {
		StaticClass sc = new StaticClass();
		sc.data(); //non static method calling
		   
		StaticClass.display(); //called without object creation
	}
}
