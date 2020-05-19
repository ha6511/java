package com.ict.edu3;

public class T_Sub extends T_Super{
	String	addr;
	int	car;
	
	public T_Sub() {
//		super();
		this("서울 홍대입구");
		System.out.println("자식생성자1");
	}

	public T_Sub(String addr) {
//		super();    // 상속한 경우 this()가 없으면 super()가 생략된 것이다. super()는 부모클래스의 생성자.
		this.addr = addr;
		System.out.println("자식생성자2");
	}
	
	public T_Sub(int car) {
		this.car = car;
		System.out.println("자식생성자3");
	}

	public T_Sub(String addr, int car) {
		this.addr = addr;
		this.car = car;
		System.out.println("자식생성자4");
	}
	public T_Sub(int car, String addr) {
		this.addr = addr;
		this.car = car;
		System.out.println("자식생성자5");
	}
	

}
