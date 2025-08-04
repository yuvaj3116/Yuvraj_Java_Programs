package com.yuvraj;

class Calculator{
	Calculator(int a,int b) {
		int sum = a+b;
		System.out.println("Addition"+ sum);
	}
	

	Calculator(int a,int b, boolean multiply) {
		int multiplication = a*b;
		System.out.println("Multiplication"+ multiplication);
	}
	
	
	Calculator(double a,double b) {
		double substraction =  a - b;
		System.out.println("Substraction"+ substraction);
	}
		
}


public class SimpleCalculatorWithoutInput {
	public static void main(String[] args) {
		new Calculator(10.2, 20.2);
		new Calculator(10, 20);
		new Calculator(10, 20, false);
	}
}
