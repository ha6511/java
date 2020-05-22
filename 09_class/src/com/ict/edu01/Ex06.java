package com.ict.edu01;

//	Local 내부 클래스 
public class Ex06 {
	
	String	name	=	"둘리";
	
	public Ex06()	{
		System.out.println("외부 : " + this );
	}
	
	public void sound()	{
		System.out.println("호이~ 호이~");
	}
	
	public void play() {
		int	age = 24;
		
		class In_01 {
			int money = 2000;
			
			public In_01() {
				System.out.println("내부 :" + this);
			}
			
			public void hobby()	{
				System.out.println(name);
				System.out.println(age);
				System.out.println(money);
			}
		}	//	내부 클래스 끝
		
		In_01 in01 = new In_01();
		
		in01.hobby();
		System.out.println("==============");
		
		System.out.println("외부 메소드 안");
		
	}		//	외부 메소드 끝
}
