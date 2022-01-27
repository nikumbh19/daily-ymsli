package com.day6;

class MyThread implements Runnable{
	Thread thread;
	
	public MyThread(String msg) {
		thread = new Thread(this,msg);
	}
	
	public void run() {
		int i = 0;
		while(i<=100) {
			System.out.println("Thread: "+thread.getName()+" prints: "+i);
			i++;
		}
	}
	
}

public class Print1To100 {
	public static void main(String[] args) {
		MyThread thread = new MyThread("1");
		MyThread thread2 = new MyThread("2");
		MyThread thread3 = new MyThread("3");
		thread.thread.start();
		thread2.thread.start();
		thread3.thread.start();
	}
}