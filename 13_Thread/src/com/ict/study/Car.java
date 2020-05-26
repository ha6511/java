package com.ict.study;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private List<String> carList = null;
	
	public Car() {
		
		carList = new ArrayList<String>();
		
	}

	public String getCar() {
		
		String carName = null;
		
		switch ((int)(Math.random()*3)) {
		case 0 : carName = "SM5"; 		break;
		case 1 : carName = "메그너스"; 	break;
		case 2 : carName = "카렌스"; 	break;
		}
		
		return	carName;
	}
	
	public synchronized String pop() {
		
		String carName = null;
		
		if (carList.size() == 0) {
			System.out.println("차가 없어요.. 생산할때까지 기다리세요");
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		carName = carList.remove(carList.size() - 1);
		
		System.out.println("손님이 " + carName + "를 구입했습니다.");
		
		return carName;
		
	}

	public synchronized void push(String car)	{
		
		carList.add(car);
		
		System.out.println(car + " 차가 만들어 졌습니다.");
		System.out.println(carList);
		
		if	(carList.size() == 5)	{
			this.notify();
		}
	}
	
}
