package com.accessModifiers;

public class Base {
	
	int varDefault = 10;
	public int varPublic = 11;
	private int varPrivate = 12;
	protected int varProtected = 13;
	
	void methodDefault() {
		System.out.println("Default Access Modifier");
		System.out.println("Default variable "+ varDefault);
	}
	
	void methodPublic() {
		System.out.println("Public Modifiers");
		System.out.println("Public Variable "+ varPublic);
	}
	
	void methodPrivate() {
		System.out.println("Private modifier");
		System.out.println("Private Variable "+ varPrivate);
	}
	
	void methodProtected() {
		System.out.println("Prtected Modifier");
		System.out.println("Protected Variable "+ varProtected);
	}
	
}
