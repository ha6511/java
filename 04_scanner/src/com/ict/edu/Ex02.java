package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 숫자를 받아서 홀수, 짝수를 구분하자
//		System.out.print("숫자 입력 : ");
//		int	su	=	sc.nextInt();
//		String result = "";
//		
//		if (su % 2 == 0)	{
//			result = "짝수";
//		}	else	{
//			result = "홀수";
//		}
//		
//		System.out.println("결과 : " + result);
		
		// 1. 한국->서울 2.중국->베이징 3.일본->도쿄
//		System.out.print("나라 입력 => 1. 한국, 2.중국, 3.일본 => ");
//		int num = sc.nextInt();
//		String result = "";
//		if (num==1) {
//			result = "서울";
//		} else if(num==2){
//			result = "베이징";
//		} else if(num==3){
//			result = "도쿄";
//		}
//		System.out.println("결과:"+result );
//		System.out.println();
		
		// 1. 한국->서울 2.중국->베이징 3.일본->도쿄
//		System.out.print("나라 입력 => 한국, 중국, 일본 => ");
//		String contry = sc.next();
//		result = "";
//		switch (contry) {
//		case "한국":
//			result = "서울";
//			break;
//		case "중국":
//			result = "베이징";
//			break;
//		case "일본":
//			result = "도쿄";
//			break;
//		default:
//			result = "데이터 없음";
//			break;
//		}
//		System.out.println("결과:"+result );
//		System.out.println();
		
		
		// 근무시간이 8시간까지는 8590원이고 
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다. 
		// 근무시간을 입력해서 알바금액을 산정하자.		
		System.out.print("근무시간 : ");
		int time = sc.nextInt();
		int pay = 0;
		int base = 8590;
		int limit = 8;
		if (time > limit ) {
			pay = (limit * base) + (int)(((time-limit)*base)*1.5);
		} else {
			pay = time * base;
		}
		System.out.println("급여는 " + pay );
		System.out.println();
		
		
		// menu가 1이면 카페모카 3500, 2이면 카페라테 4000, 3이면 아메리카노 3000 4이면 과일쥬스 3500 이다.
		// 친구와 2잔을 10000 내고 먹었다.
		// 메뉴를 고른 결과와 잔동를 출력 (단, 부가세 10% 포함)
		System.out.print("menu선택 : \n1.카페모카(3500) \n2.카페라테(4000) \n3.아메리카노(3000) \n4.과일쥬스(3500) >> ");
		int menu= sc.nextInt();
		String 	name = "";
		int		cost = 0;
		int		sum	 = 0;
		int		ret	= 0;
		int		su  = 2;
		int		input = 10000;
		switch (menu) {
		case 1: 
			name = "카페모카";
			cost = 3500;
			break;

		case 2: 
			name = "카페라테";
			cost = 4000;
			break;

		case 3: 
			name = "아메리카노";
			cost = 3000;
			break;

		case 4: 
			name = "과일쥬스";
			cost = 3500;
			break;
		}
		
		cost *= su;
		sum = (int)(cost * 1.1);
		ret = input - sum;
		
		System.out.println(name + " " + su +"잔의 가격은 "+ cost + "이고 " + "부가세 포함가격은 " + sum + "이다.");
		System.out.println("거스름돈은 " + ret + "이다.");
		
		System.out.println();
	}
}
