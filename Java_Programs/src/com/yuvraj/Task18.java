package com.yuvraj;


class Animal_ {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal_ {
    void bark() {
        System.out.println("Dog barks");
    }


public class Task18 {
	

	    public static void main(String[] args) {
	        Dog d = new Dog();
	        d.sound();
	        d.bark();
	    }
	}

}
