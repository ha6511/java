package com.ict.edu01;

public class Ex06_main {

	public static void main(String[] args) {
		
		//	내부클래스 별도로 객체 생성 안됨 
		//	In_01  in01 = new In_01();
		
		Ex06 e6 = new Ex06();
		e6.sound();
		System.out.println("----------------");
		
		//	1. 내부클래스가 존재하는 메소드를 실행시킨다.
		e6.play();
		//	내부클래스가 존재하는 메소드 실행이 끝나면 내부크래스 사용 못함  
		
		
		
		// Member 내부클래스 만드는 방식으로 객체 생성 못함 
		// Ex06.In_06 in01 = e6.new In_06();
		
		System.out.println("main 외부 메소드 끝 ");
		
		
	}
}
