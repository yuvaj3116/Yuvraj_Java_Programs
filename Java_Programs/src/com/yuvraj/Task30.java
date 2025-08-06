package com.yuvraj;

abstract class Vehicle {
    abstract void start();
}

class Car_ extends Vehicle {
    void start() {
        System.out.println("Car is starting...");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is starting...");
    }

public class Task30 {
	
	    public static void main(String[] args) {
	        Vehicle v1 = new Car_();
	        Vehicle v2 = new Bike();
	        v1.start();
	        v2.start();
	    }
	}

}
