package com.ict.edu1;

public class Ex01_currentThread {

	public static void main(String[] args) { 
		//	Thread.currentThread() : 현재 실행중인 스레드 
		//	Thread.currentThread().getName() : 현재 실행중인 스레드의 이름 호출 
		System.out.println("현재 실행중인 스레드 : " + Thread.currentThread().getName());
		
		Ex02_currentThread test = new Ex02_currentThread();
		
		System.out.println("0");
		test.play();
		System.out.println("1");
		String name = test.sound();
		System.out.println(name);
		System.out.println("2");
		
		System.out.println("===================");
		
		Ex03 test2 = new Ex03();
		
		
		System.out.println("1 : " + Thread.currentThread().getName());
		test2.go();

		System.out.println("2 : " + Thread.currentThread().getName());

		//test2.run();
		test2.start();		//	Ex03 에 start() 가 있으면 single 스레드 이다.,
							//	Ex03 에 start() 가 없으면 multy 스레드 처리한다.
		System.out.println("3 : " + Thread.currentThread().getName());
		
		
	}
}
