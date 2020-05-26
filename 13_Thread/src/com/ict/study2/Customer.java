package com.ict.study2;

public class Customer implements Runnable{

	private Car car;

	public Customer(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		
		String	carName	=	null;
		
		for (int i = 0; i < 20; i++) {
			
			carName	=	car.pop();
			
			System.out.println("구매 차 => "+ carName);
			
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}


}
