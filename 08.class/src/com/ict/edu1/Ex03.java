//	2020-05-19

package com.ict.edu1;

import java.util.Random;

public class Ex03 extends Random{

	public static void main(String[] args) {
		//	main 메소드 도 static 이므로 
		//	지역변수를 static 을 만들 수 없고
		//	static int	num	=	nextInt(10) + 1 ;	//	1 ~ 10
		
		//	nextInt 가 static  메소드가 아니므로 사용불가 
		//	int	num	=	nextInt(10) + 1 ;	//	1 ~ 10
		//	System.out.println(num);
		
		//	play() 를 사용하기 위해서는 현재 클래스를 객체로 만들어야 한다.
		Ex03 e3	=	new Ex03();
		e3.paly();
	}
	
	public	void	paly()	{
		int	num	=	nextInt(10) + 1 ;	//	1 ~ 10
		System.out.println();
		System.out.println(num);
	}
}
