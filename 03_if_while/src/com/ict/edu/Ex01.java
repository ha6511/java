package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		//	단순 if : 조건이 참일때만 실행, 거짓일때는 if 문 무시
		//	조건식은 boolean, 비교연산, 논리연산
		//	형식 : if ( 조건식 ) {
		//				조건식이 참일때 실행문장;
		//				조건식이 참일때 실행문장;
		//			}
		//	단 실행문장이 한줄일때는 {} 생략가능
		
		//	int k1 이 60 이상이면 합격		
		int	k1 = 59;
		String str = "초기값";
		
		if (k1 >=60)	{
			str	=	"합격";
		}
		System.out.println(k1 + "은 " + str + "입니다.\n수고하셨습니다.");
		
		
		//	int k2 이 60 이상이면 합격 60 미만이면 불합격
		int	k2 = 59;
		String str2 = "초기값";
		
		if (k2 >=60)	{
			str2	=	"합격";
		}
		if (k2 < 60) {
			str2	=	"불합격";
		}
		System.out.println(k2 + "은 " + str2 + "입니다.");
		
		//	int k3 이 60 이상이면 합격 60 미만이면 불합격
		int	k3 = 59;
		String str3 = "불합격";
		
		if (k2 >=60)	{
			str2	=	"합격";
		}
		System.out.println(k3 + "은 " + str3 + "입니다.");
		
		// 홀수 짝수 판별 
		int  k4 = 7;
		String str4 = "홀수";
		if	(k4 % 2 == 0)	{
			str4 = "짝수";
		}
		System.out.println(k4 + "은 " + str4 + "입니다.");
		
		// 대소문자 판단  
		char  k5 = 'G';
		String str5 = "소문자";
		if	(k5 >= 'A' && k5 <= 'Z')	{
			str5 = "대문자";
		}
		System.out.println(k5 + "은 " + str5 + "입니다.");
		
		// 1 또는 3 이면 남자 , 아니면 여자 
		int	k6 = 1;
		String	str6 = "여자";
		
		if	(k6 == 1 || k6 == 3) {
			str6 = "남자";
		}
		System.out.println(k6 + "은 " + str6 + "입니다.");
		
		// 근무시간이 8시간까지는 시간당 8590 이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무시간은 10 이다.
		// 얼마를 받아야 하는가?
		int	time  = 10;
		int	base  = 8590;
		int limit = 8;
		int	pay	  =	 time * base;
		
		if	(time > limit)	{
			pay = (limit * base) + (int)((time - limit) * base * 1.5);
		}
		System.out.println("근무시간 "+ time + "시간의 급여는 "+ pay + "입니다.");
		
		// 두수 중 큰 값을 출력하시오.
		int k11 = 10;
		int k12 = 15;
		int result = k12;
		if (k11 > k12) {
			result = k11;
		}
		System.out.println(k11 +"와 "+ k12 + "중 큰 값은 "+ result + " 입니다.");
	}
}
