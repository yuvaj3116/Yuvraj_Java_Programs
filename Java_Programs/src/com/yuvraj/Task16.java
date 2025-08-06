package com.yuvraj;
class Calculator1 {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

public class Task16 {
	
	    public static void main(String[] args) {
	        Calculator1 calc = new Calculator1();
	        System.out.println("Int sum: " + calc.add(5, 3));
	        System.out.println("Double sum: " + calc.add(5.5, 3.2));
	    }
	}

}
