package com.ict.edu6;

import java.util.ArrayList;
import java.util.List;

//	자동차 생산 공장 
public class Car {
	
	//	차 재고 창고 
	private List<String> carList = null;

	public Car() {
		
		carList = new ArrayList<String>();
	}

	//	랜덤으로 자동차 생산하기 
	public String getCar() {
		
		String carName	=	null;
		
		switch ((int)(Math.random() * 3)) {
		case 0 : carName = "SM5"; 		break;
		case 1 : carName = "메그너스"; 	break;
		case 2 : carName = "카렌스"; 	break;
		}
		
		return	carName;
	}

	//	자동차 판매 , 소비자가 자동차를 사는 메소드 
	public synchronized String pop() {
		
		String	carName = null;
		
		//	재고가 없을 때 판매하지 못함 
		if	(carList.size() == 0) {
			
			System.out.println("*********차가 없어요.. 생산할때까지 기다리세요.");
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		//	재고가 있을때는 가장 나중에 들어간 차를 삭제(판매) 하고 그 이름을 얻어온다.
		carName = carList.remove(carList.size() - 1);
		
		System.out.println("손님이 차를 사갔습니다. 손님이 구입찬 차 이름은  "+ carName + " 입니다.\n");
		
		return	carName;
	}
	
	//	자동차 재고창고에 차 넣기 
	public synchronized void push(String car) {
		
		// 생산된 차를 재고창고(carList)에 넣기 
		carList.add(car);
		
		System.out.println("차가 만들어 졌습니다. 차이름은 "+ car + " 입니다.");
		System.out.println(carList);
		
		//	재고가 없을때  wait() 된 스레드를 다시 실행시키기 
		if (carList.size() == 5) {
			this.notify();
		}
		
	}
	
}



