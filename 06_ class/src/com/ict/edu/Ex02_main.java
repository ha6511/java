
package com.ict.edu;

import java.util.Random;

public class Ex02_main {

	public static void main(String[] args) {
		
		// 2020-05-13
		
		// static 멤버필드 호출 
		System.out.println(Ex02.eng);
		System.out.println(Ex02.com);
//		System.out.println(Ex02.kor);  // static 이 아니므로 호출 못함 
//		System.out.println(Ex02.math); // static 이 아니므로 호출 못함 
		
		
		// Ex02 클래스 객체 만들기
		// 클래스이름 참조변수 = new 생성자();
		// Ex02에 생성자가 없으면 기본생성자로 생성 
		Ex02 test = new Ex02();
		
		//  멤버필드 호출 
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.math);
		System.out.println(test.com);
		
		System.out.println(Ex02.eng);
		System.out.println(Ex02.com);
		
		System.out.println(test);
		System.out.println("================");
		
		// 	2020-05-14
		
		// 	API를 이용해서 static메소드와 인스턴스를 호출해 보자
		//	api에서 제공하는 Random클래스의 nextInt(), nextInt(int n), nextDouble()를 사용하는 예이다.
		
		//	nextInt(), nextInt(int n), nextDouble() 는 static이 아니므로 
		//	클래스를 객체로 만들어서 사용해야 한다.
		
		//	1.	클래스를 객체로 만들어서 사용하는 방법
		//		클래스 참조변수 = new 생성자 
		Random ran = new Random();
		
		//	nextin() : int범위안에서 무작위로 정수를 추출한다.
		int	res	=	ran.nextInt();
		System.out.println(res);
		System.out.println("-----------------------");
		
		//	nextInt(숫자) : 반환값(0~숫자전까지)
		res	=	ran.nextInt(6); // 0 ~ 5 까지
		System.out.println(res);
		System.out.println("-----------------------");
		
		//	정해지지 않은 0.0 이상 ~ 1.0 미만의 실수 (소숫점 한자리가 아니다)
		Double res2	=	ran.nextDouble();
		System.out.println(res2);
		System.out.println("-----------------------");
		
		// res2를 0~5까지의 정수로 표현하자
		System.out.println((int)(res2*6));
		System.out.println("-----------------------");
		
		//	api에서 제공하는 static 메소드 사용하기
		//	Math 클래스의 메소드들은 static 이므로 객체생성없이 사용가능
		//	클래스이름.멤버필드, 클래스이름.멤버메소드로 사용 
		System.out.println(Math.random());	//	0.0 이상 ~ 1.0 미만 
		
		//	원하는 정수까지로 정해지지 않은 수 지정 
		System.out.println((int)(Math.random()*6));	//	0 ~ 5 까지 
		
	}
	
}
