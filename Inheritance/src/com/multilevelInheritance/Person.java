package com.multilevelInheritance;

public class Person {
	
	private String name;
	private long mobno;
	private String add;
	
	
	public Person(String name, long mobno, String add) {
		super();
		this.name = name;
		this.mobno = mobno;
		this.add = add;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", mobno=" + mobno + ", add=" + add + "]";
	}
	
	
}
