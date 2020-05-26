package com.ict.edu3;

public class Ex02 implements Runnable{
	 
	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Ex02 : " + Thread.currentThread().getName() + " => 111111111111111111111" );
		}
		
	}

}
