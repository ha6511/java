package com.ict.edu8;

//	인터페이스 상속 
//	1. 일반클래스가 상속받으면 반드시 오버라이딩 해야 한다.
class Ex03_interface implements Ex01_interface {

	@Override
	public void play() {}

	@Override
	public void sound() {}
}

//	2. 추상클래스가 상속을 받으면 오버라이딩 할 필요가 없다.
abstract class Ex04 implements Ex01_interface {

	int	k1	=	10;	//	인스턴스 변수
	
	public	abstract void leftSoubd();
	
}

abstract class Ex05 implements Ex01_interface {

	int	k1	=	10;	//	인스턴스 변수
	
}

//	3. 인터페이스가 상속을 받으면 오버라이딩 할 필요가 없다.
interface Ex06 extends Ex01_interface	{
	int k1  = 10; // static final
}

//	2, 3 번은 나중에라도 일반클래스가 상속받으면 모두 오버라이딩 해야한다.
class	Ex07	extends Ex05 {
	@Override
	public void play() {}
	
	@Override
	public void sound() {}
}

class	Ex08	extends Ex04 {
	@Override
	public void play() {}
	
	@Override
	public void sound() {}
	
	@Override
	public void leftSoubd() {}
}