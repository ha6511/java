package com.ict.edu2;

public class Ex01 extends Thread {
 
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Ex01 : " + Thread.currentThread().getName() + " => aaaaaaaaaaaaaa" );
		}
	}
}
