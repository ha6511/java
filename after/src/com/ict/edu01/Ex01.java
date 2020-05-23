package com.ict.edu01;

public class Ex01 {
	
	public static void main(String[] args) {
		//	배열 : 	같은 자료형의 데이터(값)을 한 곳에 모아둔 묶음 
		//			반드시 같은 자료형일때만 저장 가능 
		//			배열을 생성할 때 반드시 크기를 지정해야 한다.
		//			한번 크기를 지정하면 변경할 수 없다.
		//			배열의 출력은 일반적으로 for문을 쓴다.
		
		//	배열 생성 순서 : 선언 -> 생성 -> 저장 -> 출력 
		
		//	1.	선언 : 자료형[] 이름;
		//	su 를 선언한다.
		int[] su;
		
		//	2.	생성 : 이름 = new 자료형[크기=1부터 시작];
		//	new => 객체 생성하자는 예약어  
		//	5개의 방이 만들어진다 => 만들어진 주소를 su에게 저장한다.
		su = new int[5];
		
		//	3. 데이터 저장 : su[index=방번호=0부터시작] = 데이터 
		su[0] = 10;
		su[1] = 20;
		su[2] = 30;
		su[3] = 40;
		su[4] = 50;
		
		//	4.	출력
		System.out.println(su); 	//	배열의 주소
		System.out.println("=============");
		
		System.out.println(su[0]);	//	방안의 데이터가 나온다.
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println(su[4]);
		System.out.println("=============");
		
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println("=============");
		
		System.out.println("개선된 FOR 문");	//	배열, 컬렉션에서 사용
		for (int k : su) {		//	su 의 index의 처음 부터 끝까지 의 값을 k에 넘겨준다.
			System.out.println(k);
		}
		System.out.println("=============");
		
		//	char 배열의 방 4 짜리 
		//	j, a, v, a 가 방에 넣어 주세요
		//	출력도 해주세요
		char[] ch	=	new	char[4];
		ch[0]	=	'j';
		ch[1]	=	'a';
		ch[2]	=	'v';
		ch[3]	=	'a';
		for (char k : ch) {
			System.out.println(k);
		}
	}
}
