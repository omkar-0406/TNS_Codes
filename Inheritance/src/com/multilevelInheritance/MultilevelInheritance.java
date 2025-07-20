package com.multilevelInheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Person p1 = new Person("Omkar",9876543210l,"Pune");
		System.out.println(p1);
		
		p1=new Employee("Omkar",9876543210l,"Pune","HR",500000);
		System.out.println(p1);
		
		p1=new L1Employee("Omkar",9876543210l,"Pune","HR",500000,1000,"Signing");
		System.out.println(p1);
	}

}
