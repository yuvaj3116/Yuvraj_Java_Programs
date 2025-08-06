package com.yuvraj;

class Parent_ {
    Parent_() {
        System.out.println("Bmw");
    }

    void show() {
        System.out.println("Merc");
    }
}

class Child_ extends Parent_ {
    Child_() {
        super(); 
        System.out.println("Zx10");
    }

    void show() {
        super.show(); 
        System.out.println("Shotgun");
    }

public class Task29 {
	
	    public static void main(String[] args) {
	        Child_ c = new Child_();
	        c.show();
	    }
	}

}
