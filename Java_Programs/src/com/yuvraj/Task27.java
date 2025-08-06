package com.yuvraj;

class Calculator_ {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

public class Task27 {
	
	    public static void main(String[] args) {
	        Calculator_ calc = new Calculator_();
	        System.out.println("Int Sum: " + calc.add(2, 3));
	        System.out.println("Double Sum: " + calc.add(2.5, 3.5));
	    }
	}
}
