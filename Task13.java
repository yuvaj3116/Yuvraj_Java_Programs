package com.yuvraj;

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		

		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		sc.close();
		
		System.out.println("Your Name is :" + name + " Your Age is :" + age);
		
	}
}
