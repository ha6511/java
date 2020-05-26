package com.ict.edu3;

public class testMain {
	
	public static void main(String[] args) {
		
		Ex01 testA = new Ex01(); 
		Ex02 testB = new Ex02();
		
		//	testA,testB 는 Runable 를 가지고 구현했으므로 start() 가 없다.
		//	start() 가  run() 을 호출할 수 없으므로 스레드 처리가 아니다.
		//	testA.run();
		//	testB.run();
		
		//	start()는 thread 클래스가 가지고 있으므로 
		//	Thread 클래스를 활용해야 한다.
		
		System.out.println("MAIN  START");
		
		//	방법 1 : Runnable를 상속받은 객체를 Thread생성자에 넣어준다.
		Thread  thread = new Thread(testA);
		thread.start();
		
		new Thread(testB).start();
		
		//	방법 2 : 안드로이드에서 사용하는 방법(익명내부클래스)
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println("Main : " + Thread.currentThread().getName() + " => 가가가가가각" );
				}
				
			}
		}).start();
		
		
		System.out.println("MAIN  END");
		
		
		
		
	}

}
