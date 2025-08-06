package com.yuvraj;

public interface Task17 {
	interface Shape {
	    void draw();
	}

	class Circle implements Shape {
	    public void draw() {
	        System.out.println("Drawing a Circle");
	    }

	    public static void main(String[] args) {
	        Circle c = new Circle();
	        c.draw();
	    }
	}

}
