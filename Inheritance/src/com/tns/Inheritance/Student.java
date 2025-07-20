package com.tns.Inheritance;

public class Student extends Citizen {
	
	private int rollno;
	private String collegeName;
	
	public Student() {
		super();
	}

	public Student(String name, long aadharno, String address, long mobno, int rollno, String collegeName) {
		super(name, aadharno, address, mobno);
		this.rollno = rollno;
		this.collegeName = collegeName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ", Aadharno=" + getAadharno() + ", Address=" + getAddress() + ", Mobno=" + getMobno()
				+ "]";
	}
	
	
	
	
	
	

}
