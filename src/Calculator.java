import java.util.*; // Linter should complain about this
	// Linter should complain about this

public class Calculator {
	
	public double add(double a, double b) {
		double result = a  + b;
		return result;
	}
	
	public double multiply(double a, double b) {
		double result = a  * b;
		return result;
	}
	
	public double customOperation(double a, double b) {
		double result = add(a, b) + multiply(a,b);
		if (result < -1) // Linter should complain about this
			System.out.println("Negative result");
		return result;
	}
}
