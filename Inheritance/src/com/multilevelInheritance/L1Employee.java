package com.multilevelInheritance;

public class L1Employee extends Employee{
	
	private int noofshares;
	private String authority;
	

	public L1Employee(String name, long mobno, String add, String dept, int basesalary,int noofshares, String authority) {
		super(name,mobno,add,dept,basesalary);
		this.noofshares = noofshares;
		this.authority = authority;
	}


	public int getNoofshares() {
		return noofshares;
	}

	public void setNoofshares(int noofshares) {
		this.noofshares = noofshares;
	}

	public String getAuthority() {
		return authority;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}


	@Override
	public String toString() {
		return "L1Employee [noofshares=" + noofshares + ", authority=" + authority + ", toString()=" + super.toString() + "]";
	}


	
	
	
}
