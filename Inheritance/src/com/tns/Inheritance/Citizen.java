package com.tns.Inheritance;

public class Citizen {
	
	private String name;
	private long aadharno;
	private String address;
	private long mobno;
	
	
	
	public Citizen() {
		System.out.println("Default Constructor");
	}

	public Citizen(String name, long aadharno, String address, long mobno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.mobno = mobno;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public static void main(String[] args) {
		
		
	}

}
