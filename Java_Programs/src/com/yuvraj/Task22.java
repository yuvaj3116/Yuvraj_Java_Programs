package com.yuvraj;

import java.util.Scanner;

interface ATMs {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

class SimpleATMs implements ATMs {
    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
public class Task22 {
	

	

	    public static void main(String[] args) {
	        SimpleATMs atm = new SimpleATMs();
	        Scanner sc = new Scanner(System.in);

	        atm.deposit(5000);
	        atm.withdraw(1500);
	        atm.checkBalance();
	    }
	}

}
