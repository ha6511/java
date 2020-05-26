package com.ict.edu5;

public class Ex02_main {
	
	public static void main(String[] args) {
		
		Ex02 e2 = new Ex02();
		
		Thread t1 = new Thread(e2, "Tom");
		Thread t2 = new Thread(e2, "Jerry");
		
		System.out.println("main Start"+ Thread.currentThread().getName());
		t1.start();
		t2.start();
		System.out.println("main End"+ Thread.currentThread().getName());
	}
}


// p674 


// wait() : 재우다  => 하고 있는 스레드를 동기화 해서 멈춘다.

// notify() : 깨우다 => 멈추어 있는 것을 깨운다.
