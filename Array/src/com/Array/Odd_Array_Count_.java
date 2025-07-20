package com.Array;

public class Odd_Array_Count_ {
	
	public static int getOddCount(int b[]) {
		int count=0;
		for(int i=0; i<b.length;i++) {
			if(b[i]%2 !=0) {
				count++;
			}
		}
		return count;

	}
	
	public static void main(String[] args) {
		int b[]= {10,20,23,34,56,77};
		getOddCount(b);
		System.out.println("Odd Count: "+ getOddCount(b));
	}

}
