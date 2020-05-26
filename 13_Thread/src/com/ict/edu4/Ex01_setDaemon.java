package com.ict.edu4;

//	데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역활을 수행하는 스레드
//				  일반 스레드가 종료하면 데몬 스레드는 강제적으로 종료 됨  
//				  thread.setDaemon(true);  으로 처리 
public class Ex01_setDaemon implements Runnable {

	boolean autoSave = false;

	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(1000 * 3);	//	3초 마다 대기 상태 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("11111111111111");
			if (autoSave) {
				autoSave();
			}
		}

	}
	
	public void autoSave() {
		System.out.println("작업파일을 자동 저장합니다.");
	}
	
	public static void main(String[] args) {
		
		Ex01_setDaemon e1 =  new Ex01_setDaemon();
		Thread thread = new Thread(e1);
		thread.setDaemon(true);
		thread.start();
		
		
		for (int i = 0; i < 15; i++) {
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
			System.out.println("대기시간 : " + i);
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
