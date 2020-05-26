package com.ict.edu6;

//	소비자 
public class Customer implements Runnable{
	
	private Car car;

	public Customer(Car car) {
		// 생성자에서 받은 인자를 전역변수로 만든다. 
		this.car = car;
	}
	
	public void run() {
		
		String carName = null;
		
		for (int i = 0; i < 50; i++) {
			
			carName = car.pop();
			System.out.println("소비자가 산 차 이름 : "+carName);
			
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
}
