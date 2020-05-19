package com.ict.edu6;

public class main {
	
	public static void main(String[] args) {
		
		//	super 와 super() , this 와 this()
		//	this : 객체 내부에서 자기 자신을 지칭하는 예약어 
		//		   전역변수 와 지역변수 의 이름이 같을 때 전역변수 앞에 this 를 붙여 사용해서 전역변수 임을 알 수 있다.
		//	this( [인자] ) : 객체 자신의 생성자를 지칭하는 예약어 
		//			         생성자에서 자기의 다른 생성자를 호출할때 사용 
		//			         반드시 생성자 첫줄에 존재해야 한다.
		
		//	super : 부모클래스의 멤버필드를 지칭하는 예약어 
		//			자식클래스의 전역변수와 이름이 같을 때 부모클래스 멤버필드 앞에 사용 
		//	super( [인자] ) :  부모의 생성자를 지칭하는 예약어
		//					   부모생성자를 호출할때 사용
		//					   반드시 생성자 첫줄에 존재해야 한다.
		//					   this(), super() 는 둘다 생성자의 첫 줄에 써야 하므로 두가지를 함께 사용할 수는 없다.
		//					   this(), super() 는 없으면 생성되어 있는 것이다.
		
		
//		T_Sub sub = new T_Sub();
		
		Person 	s	=	new Student("홍길동 학생", 24, 25000);
		Person	t	=	new Teacher("고길동 강사", 30, "자바");
		Person	e	=	new	Employee("둘리 관리자", 40, "교무과");
		
		//	만약 Person 에 print()가 없으면 
		//	Student(), Teacher(), Employee() 에 print()가 있어도  사용불가 
		s.print();
		t.print();
		e.print();
	}
}
