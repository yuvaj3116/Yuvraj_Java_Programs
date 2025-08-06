package com.yuvraj;


class MyRunnables implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }



public class Task21 {
	
	    public static void main(String[] args) {
	        MyRunnables obj = new MyRunnables();
	        Thread t = new Thread(obj);
	        t.start();
	    }
	}

}
