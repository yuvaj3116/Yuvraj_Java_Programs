package com.yuvraj;

public class MyRunnable extends Thread {
	public void  run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Runnable Threads running" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyRunnable task = new MyRunnable();
		Thread t1 = new Thread(task);
		t1.start();
	}
}
