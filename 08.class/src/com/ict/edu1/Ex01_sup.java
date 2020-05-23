// 2020-05-19
package com.ict.edu1;

public class Ex01_sup {

	String	name	=	"홍길동";
	int		age		=	57;
	String	addr	=	"서울";
	boolean	gender	=	true;
	private	String	dog	=	"댕댕이";
	static	int		car	=	1;
	static	final	boolean	GENDER	=	true;	
	
	public	Ex01_sup()	{
		System.out.println("부모 클래스 생성자 :" + this);
	}
	
	public	void	prn1()	{
		System.out.println("부모클래스 메소드");
	}
	
	public	static	void	prn2()	{
		System.out.println("부모클래스 static 메소드");
	}
}
