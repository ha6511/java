package com.ict.study2;

public class Produce implements Runnable{
	
	private		Car	car;

	public Produce(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		
		String	carName	=	null;
		
		for (int i = 0; i < 20; i++) {
			
			carName	=	car.getCar();
			System.out.println("차생산 : " + carName);
			car.push(carName);
			
			try {
				Thread.sleep((int)(Math.random() * 200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}

	}

}
