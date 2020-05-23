//	2020-05-19
package com.ict.edu1;

public class Ex01_main {

	//	상속관계 : 	자식클래스가 부모 클래스의 멤버필드, 멤버메소드를 객체 생성 없이 
	//				마음대로 사용할 수 있는 클래스간의 관계를 말한다.
	//	           	자식클래스가 부모클래스와 관계를 맺는다.
	//	          	자식클래스  extends  부모클래스
	//	-. 자바에서는 다중 상속을 할 수 없다. 즉 부모클래스가 하나만 존재한다.
	//	-. 모든 클래스는 Object 라는 클래스를 상속 받고 있다.
	
	public static void main(String[] args) {
		
		Ex01_sub test = new Ex01_sub();
		
		System.out.println(test);
		System.out.println("==================");
		
		test.play();
		System.out.println("==================");
		
		//	부모클래스의 메소드 사용 가능 
		test.prn1();
		System.out.println("==================");
		
		//	static은 상속과 상관없이 사용 가능
		System.out.println(Ex01_sup.car);
		System.out.println(Ex01_sup.GENDER);
		Ex01_sup.prn2();
		System.out.println("==================");
		
		//	private 은 상속이어도 접근 안됨 
		//	System.out.println(Ex01_sup.dog);
		
		
	}
	
}
