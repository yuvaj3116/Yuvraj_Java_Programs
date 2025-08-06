package com.yuvraj;

interface Shape {
    void area();
}

class Circle implements Shape {
    double radius = 5;

    public void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle implements Shape {
    int length = 4, breadth = 5;

    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    
public class Task28 {
	
	    public static void main(String[] args) {
	        Shape c = new Circle();
	        Shape r = new Rectangle();
	        c.area();
	        r.area();
	    }
	}

}
