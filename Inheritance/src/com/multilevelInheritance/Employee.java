package com.multilevelInheritance;

public class Employee extends Person {
	
	private String dept;
	private int basesalary;
	
	
	public Employee(String name, long mobno, String add, String dept, int basesalary) {
		super(name, mobno, add);
		this.dept=dept;
		this.basesalary=basesalary;
	}
	
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(int basesalary) {
		this.basesalary = basesalary;
	}


	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", basesalary=" + basesalary +  ", toString()=" + super.toString()
		+"]";
	}

	
}
