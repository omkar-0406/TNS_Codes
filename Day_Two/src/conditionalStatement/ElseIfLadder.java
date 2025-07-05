package conditionalStatement;

public class ElseIfLadder {

	public static void main(String[] args) {
		int marks = 50;
		
		if(marks>70) {
			System.out.println("Selection from cap round 1");
		}else if(marks>60) {
			System.out.println("Selection from cap round 2");
		}else if(marks>45) {
			System.out.println("Selection from cap round 3");
		}else {
			System.out.println("Not selected");
		}
	}

}
