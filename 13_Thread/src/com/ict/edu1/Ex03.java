package com.ict.edu1;

// Thread 클래스에는 start(), run() 이 존재한다.
public class Ex03 extends Thread{
	
	public void go() {
		System.out.println("go() 메소드 : " +currentThread().getName());
	}
	 
	public void run() {
		System.out.println("run() 메소드 : " +currentThread().getName());
		System.out.println("run() 메소드 : " +currentThread().getName());
		System.out.println("run() 메소드 : " +currentThread().getName());
		System.out.println("run() 메소드 : " +currentThread().getName());
	}
	
//	public void start() {
//		System.out.println("start() 메소드 : " +currentThread().getName());
//		System.out.println("start() 메소드 : " +currentThread().getName());
//		System.out.println("start() 메소드 : " +currentThread().getName());
//	}
	
	

}
