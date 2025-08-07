package conditionalStatement;

public class SwitchCase {

	public static void main(String[] args) {
		char x = 'l';
		
		switch(x) {
		case 'l':
			System.out.println("Letter");
			break;
			
		case 'd':
			System.out.println("Digits");
			break;
			
		case 's':
			System.out.println("Symbol");
			break;
			
		default:
			System.out.println("Invaild input");
		}
	}

}
