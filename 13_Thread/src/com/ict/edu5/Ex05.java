package com.ict.edu5;


//	두개의 스레드를 생성하여 
//	첫번째 스레드의 출력을 1~50까지 출력하고
//	두번째 스레드의 출력을 51~100까지 출력하고
//	다시 첫번째 스레드가 101~150까지 출력하고
//	두번째 스레드가 151 ~ 200 까지 출력한다.. (synchronized 사용)
public class Ex05 implements Runnable{

	
	int x=0;
	
	@Override
	public synchronized void run() {
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println(Thread.currentThread().getName() + " : " + (++x) );
			
			if	(x==50 || x==100)	{
				try {
					wait();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}	else	{
				notify();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Ex05 t	=	new Ex05();
		new Thread(t, "tiger").start();
		new Thread(t, "lion").start();
		
		
	}
}
