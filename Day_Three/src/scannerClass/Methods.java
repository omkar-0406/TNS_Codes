package scannerClass;

public class Methods {
	
	//non parameterized method
	void addition() {
		int a = 10;
		int b = 20;
		System.out.println("Addition: "+ (a+b));
	}
	
	//parameterized method
	void substraction(int x, int y) {
		int sub = x - y;
		System.out.println("Substraction: "+ sub);
	}
	
	public static void main(String[] args) {
		Methods obj = new Methods(); //object creation
		obj.addition(); //method calling
		obj.substraction(40, 25);
	}

}
