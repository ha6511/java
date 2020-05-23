package com.ict.edu;

public class Ex05 {

	public static void main(String[] args) {

		// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		// for (초기식 ; 조건식; 증감식) {
		//		조건식이 참일때 실행할 문장 
		//	}
		//	for문은 초기식 부터 시작하고 조건식으로 이동한다.
		//	조건식은 boolean형 ( boolean, 비교연산, 논리연산)
		//	조건식이 참이면  for문 안쪽 블록을 실행한다.
		//	조건식이 거짓이면  for문을 실행하지 않는다.
		//	for 문의 끝을 만나면 무조건 증감식으로 간다.
		//	증감식은 초기식을 증가시키거나 감소시키는 역활을 하고
		//	다시 조건식으로 간다.
		
		//	자바에서는 if문, swictch문, for문 안에서 만든 변수는 
		//	밖에서 사용할 수 없다.
		
		//	Hello 열번 출력하기 
		System.out.println("====== Hello 열번 출력하기");
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = Hello");
		}
		
		//	0 에서 10까지 출력하기 
		System.out.println("====== 0 에서 10까지 출력하기");
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
		//	0 - 10 까지 짝수 출력하기
		System.out.println("====== 0 - 10 까지 짝수 출력하기");
		for (int i = 0; i < 11; i++) {
			if	(i%2==0)	{
				System.out.println(i);
			}
			
		}

		//	0 - 10 까지 홀수 출력하기
		System.out.println("====== 0 - 10 까지 홀수 출력하기");
		for (int i = 0; i < 11; i++) {
			if	(i%2==1)	{
				System.out.println(i);
			}
		}

		//	0 ~ 50 까지 7의 배수 출력하기  
		System.out.println("\n====== 0 ~ 50 까지 7의 배수 출력하기");
		for (int i = 0; i <= 50; i++) {
			if (i>0  && i%7==0)	{
				// 출력 후 한줄 띄우기 
				System.out.println(i);
			}
		}
		
		// a ~ g 
		System.out.println("\n====== a ~ g 옆으로 출력하기");
		for (char i = 'a'; i <= 'g'; i++) {
			// 옆으로 출력하기  \t는 tab을 의미 
			System.out.print(i+"\t");
		}
		
		// 한줄 띄우기 
		System.out.println();
		
		// 존재하지 않는 메소드 
		// System.out.print();
		
		//		System.out.println();  => 줄 바꾸기
		//		System.out.print(); => 존재하지 않음 
		//		System.out.println(변수 나 데이터); => 줄력 후 줄 바꾸기
		//		System.out.print(변수 나 데이터); => 옆으로 출력하기 
		
		// 5단 출력하기 
		System.out.println("\n====== 5단 출력하기");
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * "+i+" = " + 5*i);
		}
		
		System.out.println("\n=====================");
		for (int i = 1; i < 17; i++) {
			System.out.print("0\t");
			if (i%4==0) {
				System.out.println();
			}			
		}
		
		System.out.println("\n====== 0 ~ 10 의 합계");
		int sum=0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("\n====== 0 ~ 10 홀수의 합계");
		sum=0;
		for (int i = 0; i <= 10; i++) {
			if (i%2==1) {
				sum += i;
			}
		}
		System.out.println( sum );
		
		System.out.println("\n====== 0 ~ 10 짝수의 합계");
		sum=0;
		for (int i = 0; i <= 10; i++) {
			if (i%2==0) {
				sum += i;
			}
		}
		System.out.println( sum );

		System.out.println("\n====== 0 ~ 10 홀수, 짝수 의 합계");
		int sum1=0;
		int sum2=0;
		for (int i = 0; i <= 10; i++) {
			if (i%2==1) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println( "홀수 합계 : " + sum1 );
		System.out.println( "짝수 합계 : " + sum2 );
		
		System.out.println("\n====== 7! ( 7 * 6 * 5 * 4 * 3 * 2 * 1 )");
		sum=1;
		for (int i = 7; i > 0; i--) {
			sum *= i;
		}
		System.out.println( sum );
	}
}
