package com.ict.study;

public class Ex01 implements Runnable {

	boolean		autoSave	=	false;
	
	@Override
	public void run() {

		while (true) {

			try {
				Thread.sleep(1000 * 3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Demon Thread");
			
			if (autoSave) {
				autoSave();
			}
		}
		

	}
	
	public	void	autoSave()	{
		System.out.println("작업 파일을 자동 저장 합니다.");
	}
	
	public static void main(String[] args) {
		
		Ex01 ex01	=	new Ex01();
		Thread	thread	=	new	Thread(ex01);
		thread.setDaemon(true);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("대기시간 : "+ i);
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
