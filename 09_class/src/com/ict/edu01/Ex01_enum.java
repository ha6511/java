package com.ict.edu01;

//	열거형 (enum) : 상수를 하나의 객체로 인식하고, 여러개의 상수 객체들를 한 곳에 모아 둔 하나의 묶음(객체)
//	
public class Ex01_enum {
	
	static final int JAVA = 200;	//	상수 
	static final int HTML = 1000;
	
	public	enum Lessen {
		// static final 모임 
		JAVA, JSP, SPRING, ANDROID, HTML // , 1000 -- 오류  
	}
	
	public static void main(String[] args) {
		
		//	enum 에서 하나 추출
		Lessen s1	=	Lessen.JAVA;
		System.out.println("s1   : " + s1.toString());	//	JAVA	-- 객체 
		System.out.println("JAVA : " + Ex01_enum.JAVA);		//	200		-- 데이터
		System.out.println("================");
		System.out.println("HTML : " + Ex01_enum.HTML);    	//	1000	-- 데이터
		System.out.println("HTML : " + Lessen.HTML); 	//	HTML	-- 객체
		System.out.println("================");
		
		
		//	한번에 여러개 추출
		Lessen[] Item =	Lessen.values();
		
		//	ordinal : index() 값이 나온다.
		for (Lessen k : Item) {
			System.out.println(k+ ":" + k.ordinal() );
		}
	}
}