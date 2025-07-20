package com.Array;

import java.util.*;
public class ArrayClass {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,70,50,60};
		
		System.out.println("Array is: "+ Arrays.toString(arr)); //to print a array
		
		Arrays.sort(arr); //to sort array
		System.out.println("Sorted array is: " + Arrays.toString(arr));
		
		//use binary search after sorting
		int key = 50;
		Arrays.binarySearch(arr, key); //binary search to show index number
		System.out.println(key + " using binary search at index position : " + Arrays.binarySearch(arr, key));
		
		System.out.println("Array with in range: "+ Arrays.binarySearch(arr,1,4, key));
		
		
		int arr1[]= {10,20,30,40,70,50,60};
		Arrays.sort(arr1);
		System.out.println("Sorted array arr1: "+ Arrays.toString(arr1));
		
		//compare arr with arr1
		Arrays.equals(arr, arr1);
		System.out.println("Arrays are equal or not: "+ Arrays.equals(arr, arr1));
		
		if(Arrays.equals(arr, arr1)) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
		
		
		//copy arr1 to arr2
		int arr2[]=Arrays.copyOf(arr1, 10); //10 is the range 
		System.out.println("New arrays arr2: "+ Arrays.toString(arr2));
		
		//to fill the array with single value
		int x = 550;
		Arrays.fill(arr2, x);
		System.out.println("Filled arrays: "+ Arrays.toString(arr2));
		
		
		
	}

}
