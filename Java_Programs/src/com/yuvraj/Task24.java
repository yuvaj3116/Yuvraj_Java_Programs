package com.yuvraj;

class Animal_1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog_ extends Animal_1 {
    void sound() {
        System.out.println("Dog barks");
    }
    
public class Task24 {
	 
	public static void main(String[] args) {
	        Animal_1 a = new Dog_();
	        a.sound();
	    }
	}

}


	   