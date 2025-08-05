package com.yuvraj;

public interface ATM_Interface {
	abstract void checkBalance();
}
class machine implements ATM_Interface{
	public void checkBalance() {
		System.out.println("Check Balance code");
	}
}

class ATM1 {
	public static void main(String[] args) {
		machine m = new machine();
		m.checkBalance();
	}
}