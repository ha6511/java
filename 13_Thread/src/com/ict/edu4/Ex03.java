package com.ict.edu4;

public class Ex03 implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Run 1 :"+ i + " " + Thread.currentThread().getName());
		}
		System.out.println("Run 2 :"+ Thread.currentThread().getName());
		first();
		System.out.println("Run 3 :"+ Thread.currentThread().getName());
	}
	
	public void first() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("first :"+ Thread.currentThread().getName());
		}
	}
	
}
