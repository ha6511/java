package com.ict.edu5;

public abstract class Animal_abstract {
	//	추상클래스	: 	추상메소드를 가지고 있는 클래스를 추상 클래스라고 한다.
	//					일반적인 멤버필드와 멤버메소드도 가지고 있을 수 있다.
	//					반드시 abstract 를 붙여야 한다.
	//					
	//	추상메소드	:	Body가 없는 메소드를 추상메소드 라고 한다.
	//					반드시 abstract 예약어를 사용한다.

	int	su1				=	10;		//	인스턴스 변수
	static	int	su2		=	20;		//	static  변수
	final	int	SU3		=	30;		//	인스턴스 상수
	static	final	int	SU4	=	40;	//	static	상수
	
	public	void	play()	{
		su1++;
		su2++;
//		SU3++;		//	상수는 값 변경이 안됨 	
//		SU4++;		//	상수는 값 변경이 안됨
	}

	//	static 메소드 
	public static	void	prn()	{
		
		int	k1	=	100;
		
		//	지역변수 static 사용할 수 없다.
		//	static	int	k2	=	200;
		
		//	static 메소드는 전역변수에서 static만 사용 가능 
//		System.out.println(su1);
		System.out.println(su2);
//		System.out.println(SU3);
		System.out.println(SU4);
		
	}
	
	//	추상메소드 : 추상메소드는 반드시 abstract를 붙여야 한다.
	//				 반드시 class에도 abstract를 붙여야 한다.
	public	abstract void	like();	
	
	
	
}
