package LoopingStatement;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
