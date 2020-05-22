package com.ict.edu01;



enum	Type2	{
	// 상수("연결할 문자")
	WALKING("워킹화", 270), 
	RUNNING("러닝화", 250), 
	TRACING("트래킹화", 260), 
	HIKING("등산화", 240);
	
	final private String name;
	final private int	size;

	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	// 문자를 받아오는 함수 
	public String getName() {
		return name;
	}
	
	public int getSize() {
		return size;
	}
}

public class Ex03_enum {
	
	public static void main(String[] args) {
		
		for (Type2 k : Type2.values()) {
			System.out.println(k.name() + ":" +k.getName() + ":" + k.getSize());
		}
	}

}
