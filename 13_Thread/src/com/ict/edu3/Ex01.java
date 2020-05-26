package com.ict.edu3;

// Runnable 인터페이스는 추상메소드 run 만 가지고 있다.
public class Ex01 implements Runnable {
	 
	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			
			System.out.println("Ex01 run : " + Thread.currentThread().getName() + " => 111111111111111111111" );

		}
		
		play();
	}

	
	public void play() {
		
		for (int i = 0; i < 50; i++) {
			
			System.out.println("Ex01 play : " + Thread.currentThread().getName() + " => 222222222222222222222" );

		}
	}
}
