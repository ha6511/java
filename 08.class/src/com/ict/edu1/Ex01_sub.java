// 2020-05-19
package com.ict.edu1;

//	자식 클래스 : 자식클래스에서 부모클래스와 상속관계를 맺는다.
public class Ex01_sub extends Ex01_sup{

	String	name	=	"홍반장";
	int		age		=	13;
	
	public	Ex01_sub()	{
//		super();  	// 생략되어 있다. 
		System.out.println("자식 클래스 생성자 : " + this);
	}
	
	public	void	play()	{
		
		System.out.println(name);  // 홍반장
		
		//	지역변수가 우선 
		String	name	=	"홍두께";
		System.out.println(name);  // 홍두께
		
		//	지역 x, 전역 x, 부모 o  이므로 가능 
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		
		int	age	=	3;
		System.out.println("지역 : "+ age);			//	3
		System.out.println("전역 : "+ this.age);	//	13	
		System.out.println("부모 : "+ super.age);	//	57
		
	}
	
	public	void	play2()	{
		//	private 은 상속이어도 접근 안됨 
		//	System.out.println(dog);
		System.out.println(GENDER);
		System.out.println(car);
		
	}
}
