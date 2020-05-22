package com.ict.edu01;

enum	Type	{
	WALKING, RUNNING, TRACING, HIKING
}

public class Ex02_enum {
	
	public	String 	name;
	public	int		size;
	public	Type	type;
	
	public	static	void	main(String[] args)	{
		
//		System.out.println(name); // static method 는 전역변수는 static 변수만 사용가능 
		Ex02_enum shose = new Ex02_enum();
		shose.name = "나이키";
		shose.size = 270;	
		shose.type = Type.RUNNING;
		
		System.out.println("신발 이름 : "+ shose.name);
		System.out.println("신발 사이즈 : "+ shose.size);
		System.out.println("신발 종류 : "+ shose.type);
	}
}
