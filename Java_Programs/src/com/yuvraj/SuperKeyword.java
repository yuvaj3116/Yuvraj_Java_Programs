package com.yuvraj;


class Parent {
	void car() {
		System.out.println("BMW");
	}
}

class Son extends Parent {
	void car() {
		super.car();
		System.out.println("G-Wagon");
		
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.car();
		
	}

}
