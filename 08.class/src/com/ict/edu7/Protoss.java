package com.ict.edu7;

//	Unit 은 추상클래스 이기 때문에
//	일반클래스인 Protoss 는 반드시 오버라이딩 해야 한다.

public class Protoss extends Unit{

	String 	name;
	int		energy;
	boolean	fly;
	
	public Protoss() {
		// TODO Auto-generated constructor stub
	}
	

	public Protoss(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}


	@Override
	public void decEnergy() {
		// TODO Auto-generated method stub
		energy	=	energy - 2;
	}
	
	
}
