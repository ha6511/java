package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		
		//	switch ~ case : if문과 같이 조건문
		//	if 문은 조건식이 boolean형이다. 즉 비교연산, 논리연산, boolean형 사용
		//	wwitch문은 인자값이 byte, short, int, char, String 일때 사용
		//
		//		switch (인자값) {
		//		case 조건값1 : 인자값과 조건값1과 같을때 수행할 문장 ;					
		//			break;
		//		case 조건값2 : 인자값과 조건값2과 같을때 수행할 문장 ;					
		//			break;
		//		case 조건값3 : 인자값과 조건값3과 같을때 수행할 문장 ;					
		//			break;
		//		case 조건값4 : 인자값과 조건값4과 같을때 수행할 문장 ;					
		//			break;
		//		default:
		//			break;
		//		}
		//	break가 없으면 break를 만날때 까지 모든 실행문을 실행
		// 	break의 역활은 현재 실행하고 있는 범위를 벗어나는 역활 
		
		String	result	=	"";
		
		//	char k1이 A 이면 아프리카, B 이면  브라질, C이면 캐나다, 나머지는 한국
		char	k1	=	'A';
		switch (k1) {
		case 'A':	result	=	"아프리카";			
					break;
		case 'B':	result	=	"브라질";			
					break;
		case 'C':	result	=	"캐나다";			
					break;
		default:	result	=	"한국";	
					break;
		}
		System.out.println(k1 +"은 "+ result + "이다");
		
		
		//	char k2이 A,a 이면 아프리카, B,b 이면  브라질, C,c이면 캐나다, 나머지는 한국
		char	k2	=	'B';
		switch (k2) {
		case 'A':	
		case 'a':	result	=	"아프리카";			
					break;
		case 'B':	
		case 'b':	result	=	"브라질";			
					break;
		case 'C':	
		case 'c':	result	=	"캐나다";			
					break;
		default:	
					result	=	"한국";	
					break;
		}
		System.out.println(k2 +"은 "+ result + "이다");
		
		
		//	int k3가 1 또는 3 이면 남자, 2또는 4이면 여자 
		int	k3	=	1;
		switch (k3) {
		case 1:	
		case 3:		result	=	"남자";			
					break;
		case 2:	
		case 4:		result	=	"여자";			
					break;
		}
		System.out.println(k3 +"은 "+ result + "이다");
		
		
		//  String k4 이  한국 이면 서울 , 중국이면 북경, 일본이면 동경, 미국이면 워싱턴 
		String	k4	=	"한국";
		switch (k4) {
		case "한국":
					 result	=	"서울";
					 break;
		case "중국":
					result	=	"북경";
					break;
		case "일본":
			 		result	=	"동경";
			 		break;
		case "미국":
			 		result	=	"워싱턴"; 
			 		break;
		}
		System.out.println(k4 +" 수도는 "+ result + "이다");
		
		// switch 문은 범위가 넓어지면 사용하지 말고 if  문을 사용하자
		// int k6의 점수가 90이상이면 A, 80이상이면 B, 70 이상이면 C, 나머지는 F
		int 	k6	=	94;
		switch	((int)(k6/10))	{
			case	10	:
			case	9	:	result	=	"A";	break;	
			case	8	:	result	=	"B";	break;	
			case	7	:	result	=	"C";	break;	
			default		:	result	=	"F";	break;	
		}
		System.out.println(k6 +" 학점은 "+ result + "이다");
		
		
		
	}
}
