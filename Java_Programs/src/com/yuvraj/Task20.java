package com.yuvraj;

class MyThreads extends Thread {
    public void run() {
        System.out.println("Thread is running ");
    }

public class Task20 {
	
	    public static void main(String[] args) {
	        MyThreads t1 = new MyThreads();
	        t1.start();
	    }
	}

}
