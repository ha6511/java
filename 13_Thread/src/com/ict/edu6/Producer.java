package com.ict.edu6;

public class Producer implements Runnable{
	
	private Car car;
	
	public Producer(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		
		String carName = null;
		
		for (int i = 0; i < 50 ; i++) {
			
			//	자동차 생산 
			carName = car.getCar();
			System.out.println("생산한 차이름 : "+carName);
			
			//	자동차 창고에 넣기 
			car.push(carName);
			
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
		}
		
	}
}
