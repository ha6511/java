package com.ict.study;

public class Ex02 implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Run 1 : " + i + " " + Thread.currentThread().getName());
			
		}
		System.out.println("Run 2 : " + Thread.currentThread().getName());
		work();
		System.out.println("Run 3 : " + Thread.currentThread().getName());
		
		
	}
	
	public	void	work()	{
		
		for (int i = 0; i < 50; i++) {
			
			System.out.println("work  : " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("메인 Start");

		Ex02	ex02	=	new Ex02();
		Thread	thread	=	new Thread(ex02);
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 End");
	}
}
