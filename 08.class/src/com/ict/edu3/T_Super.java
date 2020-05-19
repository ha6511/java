package com.ict.edu3;

public class T_Super {

	String	name;
	int		age;
	
	public T_Super() {
		System.out.println("부모생성자");
	}

	public T_Super(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
