package com.ict.study;

//	소비자 
public class Customer implements Runnable{
	
	private Car car;

	public Customer(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		
		String carName = null;
		
		for (int i = 0; i < 20; i++) {
			
			carName = car.pop();
			System.out.println(carName);
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
