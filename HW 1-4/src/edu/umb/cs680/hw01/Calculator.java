package edu.umb.cs680.hw01;

public class Calculator {
	public double multiply(double x,double y) {
		return (x*y);
	}
	
	public float divide(float x, float y) {
		if(y==0) {
			throw new IllegalArgumentException("undefined!!");
		}else {
			return (x/y);
		}
		
	}

	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		System.out.println("the value is " +calculator.multiply(1, 3));
		System.out.println("the value is " +calculator.divide(3, 1));
		System.out.println("the value is " +calculator.divide(3, 0));

	}
}
