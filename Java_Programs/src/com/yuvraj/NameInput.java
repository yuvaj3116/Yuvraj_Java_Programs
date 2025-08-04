package com.yuvraj;

import java.util.Scanner;

public class NameInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		
		System.out.println("Enter your phone number");
		long phone = sc.nextLong();
		
		System.out.println("Thank u so much" + " " + name + " " + phone);
		sc.close();
	}

}
