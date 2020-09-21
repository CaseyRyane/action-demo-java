package simpleAdd;

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
		return result;
	}
}
