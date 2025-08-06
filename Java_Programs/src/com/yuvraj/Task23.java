package com.yuvraj;


class Person_ {
    String name = "Yuvraj";
    int age = 20;
}

class Student_ extends Person_ {
    int rollNo = 44;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }


public class Task23 {
	public static void main(String[] args) {
        Student_ s = new Student_();
        s.displayDetails();
		}
	}
}

	    
