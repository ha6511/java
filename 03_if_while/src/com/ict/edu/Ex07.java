package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while 문 : for 문 과 같은 반복문
		//	형식1	:
		//		초기식
		//		while(조건식) {
		//			조건식이 참일때 실행;
		//			증감식;
		//		}
		//		while문 끝을 만나면 무조건 조건식으로 가라.
		//
		//	형식2	:
		//		초기식 
		//		while(true) {
		//			if	(빠져나갈 조건)		break;
		//			조건식이 참일때 실행;
		//			증감식;
		//		}
		//		while문 끝을 만나면 무조건 조건식으로 가라.
		
		//	0 ~ 10 까지 출력
		System.out.println("\n\n***0 ~ 10 까지 출력");
		for (int i = 0; i < 11; i++) {
			System.out.print(i+ " ");
		}

		System.out.println("\n\n***0 ~ 10 까지 출력");
		int k1=0;		
		while (k1 < 11) {
			System.out.print(k1 + " ");
			k1++;
		}

		System.out.println("\n\n***0 ~ 10 까지 출력");
		int	k2=0;
		while(true) {
			if	(k2 > 10)	{
				break;
			}
			k2++;
			System.out.print(k2 + " ");
		}

		//	0 - 10 까지 짝수 출력하기
		System.out.println("\n====== 0 - 10 까지 짝수 출력하기");
		int i=0;
		while (i<11) {
			if	(i%2==0)	{
				System.out.print(i+"\t");
			}
			i++;
		}
		
		//	0 - 10 까지 홀수 출력하기
		System.out.println("\n====== 0 - 10 까지 홀수 출력하기");
		i=0;
		while (i<11) {
			if	(i%2==1)	{
				System.out.print(i+"\t");
			}
			i++;
		}
		
		//	0 ~ 50 까지 7의 배수 출력하기  
		System.out.println("\n====== 0 ~ 50 까지 7의 배수 출력하기");
		i=0;
		while (i<=50) {
			if	(i%7==1)	{
				System.out.print(i+"\t");
			}
			i++;
		}
	
		// a ~ g 
		System.out.println("\n====== a ~ g 옆으로 출력하기");
		char ch = 'a';
		while	(ch<='g')	{
			System.out.print(ch + "\t");
			ch++;
		}
		
		// 5단 출력하기 
		System.out.println("\n====== 5단 출력하기");
		i = 1;
		while (i<10) {
			System.out.println(5 + " * " + i + " = " + 5*i);
			i++;
		}
		
		// ***********
		System.out.println("\n==================");
		i=0;
		while (i< 4)	{
			int j=0;
			while (j<4)	{
				System.out.print("0 ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("\n====== 0 ~ 10 누적합계");
		int sum = 0;
		i=0;
		while (i<11) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("\n====== 0 ~ 10 홀수의 합계");
		sum=0;
		i=0;
		while (i<11) {
			if (i%2==1) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
				
		System.out.println("\n====== 0 ~ 10 짝수의 합계");
		sum=0;
		i=0;
		while (i<11) {
			if (i%2==0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		System.out.println("\n====== 0 ~ 10 홀수, 짝수 의 합계");
		int sum0=0;
		int sum1=0;
		i=0;
		while (i<11) {
			if (i%2==0) {
				sum0 += i;
			} else {
				sum1 += i;
			}
			i++;
		}
		System.out.println("짝수 합 : " + sum0);
		System.out.println("홀수 합 : " + sum1);
		
		System.out.println("\n====== 7! ( 7 * 6 * 5 * 4 * 3 * 2 * 1 )");
		sum=1;
		i=7;
		while (i>0) {
			sum *= i;
			i--;
		}
		System.out.println(sum);
	}
}
