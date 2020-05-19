package com.ict.study;

public class Terran extends Unit{
	
	String	name;
	int		energy;
	boolean	fly;
	
	public Terran() {
	}

	public Terran(String name, int energy, boolean fly) {
		super();
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		
		energy = energy - 10;
	}
	
}
