package com.ict.study;

//	1. 일반클래스는 상속을 받으면 반드시 오버라이딩 해야 한다.
class Ex03 implements Ex01 {

	@Override
	public void play() {
	}
	@Override
	public void sound() {
	}
}

//	2. 추상클래스가 상속을 받으면 오버라이딩 할 필요가 없다.
abstract class Ex04  implements  Ex01 {

	int	k1	=	10;		//	인스턴스 변수 
	
	public abstract void leftsound();
}

//	3. 인터페이스가 상속을 받으면 오버라이딩 할 필요가 없다.
interface Ex06  extends Ex01	{
	int	k1	=	10;	//	static finial
}

// 2, 3 번은 나중에 라도 알반 클래스가 상속받으면 모두 오버라이딩해야 한다.
class	Ex07	extends	Ex04	{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leftsound() {
		// TODO Auto-generated method stub
		
	}
	
}