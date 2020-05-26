package com.ict.edu5;

//	임계영역 : 멀티스레드에서 공통으로 사용되는 영역
//			   현재 싫행중인 스레드가 순식간에 다른 스레드에게 제어권을 빼앗기는 문제가 발생 한다.
//			   해결책은 동기화 처리이다.

//	동기화 처리 : 임계영역에 synchronized 예약어를 사용하므로 동기화 처리를 한다.
//				  현재 실행 중인 스레드가 끝날때 까지 다른 스레드는 접근할 수 없는 상태(락이 걸린 상태)가 된다.

//	동기화 처리 할때 현재 실행 중인 스레드를 강제로 대기 상태로 변경시키는 메소드가 존재하는데 wait()이다.
//	한번 wait()된 스레드를 풀어 주지 않으면 그대로 대기상태로 끝난다.
//	wait()된 스레드를 풀어주는 예약어는 notify(), notifyAll() 이다.

public class Ex03 implements Runnable{

	int	x=1;

	@Override
	public synchronized void run() {
		
		for (int i = 0; i < 50; i++) {
			
			System.out.println(Thread.currentThread().getName() + " : "+ (x++));
			
			if (x==11) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
		
	}
	
}
