package scannerClass;

import java.util.*;

public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int a = sc.nextInt();
		
		System.out.println("Given input: "+ a);
		
		sc.close();
	}

}
