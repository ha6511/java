package com.ict.edu2;

public class Ex02 extends Thread{
	 
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Ex02 : " + Thread.currentThread().getName() + " => 111111111111111111111" );
		}
	}
	
}
