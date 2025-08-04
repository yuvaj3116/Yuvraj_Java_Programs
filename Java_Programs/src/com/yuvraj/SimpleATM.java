package com.yuvraj;

abstract class ATM {
    abstract void checkBalance();
    abstract void withdrawCash(double amount);
    abstract void depositCash(double amount);
}

class BankATM extends ATM {
    private double balance = 1000.0;

    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void withdrawCash(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful");
        }
    }

    public void depositCash(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful");
    }
}

public class SimpleATM {
    public static void main(String[] args) {
        ATM obj = new BankATM();
        obj.checkBalance();
        obj.depositCash(500);         
        obj.withdrawCash(200);        
        obj.checkBalance();           
    }
}
