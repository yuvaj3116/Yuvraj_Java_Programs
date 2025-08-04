package com.yuvraj;

abstract class BankAccount {
    abstract void calculateInterest();

    public void showBalance() {
        System.out.println("Showing Balance.");
    }
}

class SavingsAccount extends BankAccount {

    void calculateInterest() {
        System.out.println("Interest for Savings Account is 4%");
    }
}

class FixedDepositAccount extends BankAccount {

    void calculateInterest() {
        System.out.println("Interest for Fixed Deposit Account is 6.5%");
    }
}

public class Task11 {
    public static void main(String[] args) {
        

    	BankAccount acc1= new SavingsAccount();
    	BankAccount acc2= new FixedDepositAccount();
    	
        acc1.showBalance();
        acc1.calculateInterest();
        
        acc2.showBalance();
        acc2.calculateInterest();
       
        
    }
}
