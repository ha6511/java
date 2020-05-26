package com.ict.edu2;

public class TestMain {

	public static void main(String[] args) {
		
		System.out.println("main : " + Thread.currentThread().getName() + " => MAIN START" );
		 
		
		Ex01 t1 = new Ex01();
		Ex02 t2 = new Ex02();
		Ex03 t3 = new Ex03();
		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("main : " + Thread.currentThread().getName() + " => MAIN END" );
		
	}

}
