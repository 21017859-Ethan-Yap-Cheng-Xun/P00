
public class Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		if (a != 0) {
			//Check to ensure denominator is NOT zero.
			return b/a;
		} else {
			//throw IllegalArgumentException with specific message
			throw new IllegalArgumentException("Division by zero is NOT allowed.");
		}
	}
	
}	// end of class
