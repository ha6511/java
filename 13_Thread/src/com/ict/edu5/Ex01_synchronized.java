package com.ict.edu5;

// 임계영역 : 멀티스레드에서 공통으로 사용되는 영역을 
//			  현재 실행 중인 스레드가 순식간에 다른 스레드에게 제어권을 빼앗기는 문제가 발생한다.
//			  이를 해결하기 위한 방법이 동기화 처리이다,
//
//	동기화 처리 : 임계영역에  synchronized 예약어를 사용하면 된다.
//				  현재 싷행중인 스레드가 끝날때까지 다른 스레드는 접근할 수 없다.

public class Ex01_synchronized implements Runnable{

	int x;
	
	@Override
	public synchronized void run() {
		
		for (int i = 0; i < 50; i++) {
			
			System.out.println(Thread.currentThread().getName() + " : "+ (x++));
			
		}
		
	}
	
}
