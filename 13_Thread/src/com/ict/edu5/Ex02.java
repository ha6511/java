package com.ict.edu5;

public class Ex02 implements Runnable {

	@Override
	public void run() {
		
		kitchen();
		beadroom();
		
	}
	
	public synchronized void kitchen()	{

		System.out.println(Thread.currentThread().getName() + " is in kitchen");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		System.out.println(Thread.currentThread().getName() + " is out kitchen");
		
	}
	
	public synchronized void beadroom()	{
		System.out.println(Thread.currentThread().getName() + " is in beadroom");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		System.out.println(Thread.currentThread().getName() + " is out beadroom");
	}
	
}
