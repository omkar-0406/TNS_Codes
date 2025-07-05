package com.oops;

public class Encapsulation {
	
	private int serialNum;
	private String name;
	private int age;
	
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getage() {
		return age;
	}
	
	
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
	}

}
