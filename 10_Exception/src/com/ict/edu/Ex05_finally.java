package com.ict.edu;

import java.util.Scanner;

//	finally	: 예외처리와 상관 없이 반드시 실행해야 되는 문장에 처리할때 사용
//			  데이터베이스, I/O, 네트워크 에서 주로 사용됨 
//	 try{
//		예외 발생 가능 문장들
//	 } catch (예외객체 a) {
//	 예외객체 처리문장 
//	 } finally {
//	 무조건 빌행해야 하는 문장 
//	 }

public class Ex05_finally {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int	var	=	50;
			System.out.print("정수 입력 : ");
			
			int	su	=	sc.nextInt();
			System.out.println("정답 : " + (var / su));
			
		} catch (Exception e) {
			System.out.println("제대로 입력하세요");
			return ; // return 이 있어도 finally 는 실행하고 간다.
		} finally {
			System.out.println("반드시 수행하는 문장");
		}
		
		System.out.println("수고하셨습니다.");
	}
}
