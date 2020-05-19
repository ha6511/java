package com.ict.edu4;

//	final : 종단, 끝의 의미가 있다.
//	final class => 상속 안됨
//	final method => 오버라이딩 안됨
//	final 변수 => 값 변경 안됨 (상수)	

public class Animal {

	int	eyes	=	2;
	int	legs	=	4;
	
	public	void	like()	{
		System.out.println("잠자기");
	}
	
	public	void	sound()	{
		System.out.println("울음소리"); 
	}
	
	public	final void	sleep()	{
		System.out.println("6시간만 잠을 잔다.");
	}
}

//	상속 : 부모클래스의 모든 것을 가져다 쓰는 것 
//	오버라이딩 : 부모의 메소드를 가져다 쓰는 것 , 메소드 재정의 , 부모의 메소드를 자식이 가져와서 새롭게 만든다.
//	final : 가져다 쓰기만 하고 변경하지 못하는 것 
