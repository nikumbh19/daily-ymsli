package com.day6;

import java.util.Random;

class Sum implements Runnable{
	int sum;
	public Sum(int num) {
		this.sum = num;
	}
	@Override
	public void run() {
		Random random = new Random();
		int n = random.nextInt(10)+1;
		synchronized(this){
			System.out.println(Thread.currentThread().getName()+": "+n);
			this.sum += n;
		}
	}
	
}

public class RandomizeSum {
	public static void main(String[] args) {
		int sum=0;
		Sum thread = new Sum(sum);
		Thread thread1 = new Thread(thread, "thread 1");
		Thread thread2 = new Thread(thread, "thread 2");
		Thread thread3 = new Thread(thread, "thread 3");
		thread1.start();
		thread2.start();
		thread3.start();
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			System.out.println("Sum :" + thread.sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
