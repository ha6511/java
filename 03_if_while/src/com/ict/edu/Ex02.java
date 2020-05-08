package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else ~ : 조건식이 참일때 와 거짓일때 각각 나눠서 처리한다.
		// 형식 : if (조건식) {
		//				조건식이 참일때 실행문장;
		//				조건식이 참일때 실행문장;
		//		  }else	{
		//				조건식이 거짓일때 실행문장;
		//				조건식이 거짓일때 실행문장;
		//		  }
		
		String	str	=	"";

		//	int k2 이 60 이상이면 합격, 나머지는 불합격
		int	k2 = 59;
		if	(k2 >= 60)	{
			str	=	"합격";
		}	else	{
			str	=	"불합격";
		}		
		System.out.println(k2 + "은 " + str + "입니다.");

		// 홀수 짝수 판별 
		int  k4 = 7;
		if	(k4 % 2 == 0)	{
			str	=	"짝수";
		}	else	{
			str	=	"홀수";
		}
		System.out.println(k4 + "은 " + str + "입니다.");
		
		// 대소문자 판단  
		char  k5 = 'G';
		if	(k5 >= 'A' && k5 <= 'Z')	{
			str	=	"대문자";
		}	else	{
			str	=	"소문자";
		}
		System.out.println(k5 + "은 " + str + "입니다.");

		// 1 또는 3 이면 남자 , 아니면 여자 
		int	k6 = 1;
		if	(k6 == 1 || k6 == 3)	{
			str	=	"남자";
		}	else	{
			str	=	"여자";
		}
		System.out.println(k6 + "은 " + str + "입니다.");
		
		// 근무시간이 8시간까지는 시간당 8590 이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무시간은 10 이다.
		// 얼마를 받아야 하는가?
		int		time	= 	10;
		int		base  	= 	8590;
		int		pay	  	=	0;
		int		limit 	= 	8;
		double 	extra 	= 	1.5;		
		if	(time > limit)	{
			pay	=	( limit * base ) + (int)(( time - limit) * base * extra);  
		}	else	{
			pay	=	limit * base;  
		}
		System.out.println("근무시간 "+ time + "시간의 급여는 "+ pay + "입니다.");

		// 두수 중 큰 값을 출력하시오.
		int k11 = 10;
		int k12 = 15;
		int result = 0;
		if	(k11 > k12)	{
			result = k11;
		}	else	{
			result = k12;
		}
		System.out.println(k11 +"와 "+ k12 + "중 큰 값은 "+ result + " 입니다.");
	}
}
