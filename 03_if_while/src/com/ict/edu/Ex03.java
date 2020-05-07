package com.ict.edu;

public class Ex03 {
	
	public static void main(String[] args) {
		//	중첩 if문 : if문을 여러개 사용한 문
		//	형식)  if  (조건식1) {
		//				조건식1이 참일때 실행문장;
		//			}else	if	(조건식2)	{
		//				조건식1는 거짓이고 조건식2가 참일때 실행문장 
		//			}else	if	(조전식3)	{
		//				조건식1,2는 거짓이고 조건식3가 참일때 실행문장
		//			}else	}
		//				조건식1,2,3는 거짓일때 즉 나머지 
		//			}

		String	res	=	"";
		//	inf	k1의 점수가 90이상이면 A, 80이상이면 B,  70이상이면 C 나머지  F
		int	k1	=	75;
		if	(k1 >= 90)	{
			res	=	"A";
		}	else	if	(k1 >= 80){
			res	=	"B";
		}	else	if	(k1 >= 70){
			res	=	"C";
		}	else	{
			res	=	"F";
		}
		System.out.println(k1 +"은 "+ res + "이다");
		
		//	char k2 가 대문자인지, 소문자인지, 숫자인지, 기타문자 인지 판별
		char	k2	=	'A';
		if	(k2 >= 'A' && k2 <= 'Z')	{
			res	=	"대문자";
		}	else	if	(k2 >= 'a' && k2 <= 'z')	{
			res	=	"소문자";
		}	else	if	(k2 >= '0' && k2 <= '9')	{
			res	=	"숫자";
		}	else	{
			res	=	"기타문자";
		}
		System.out.println(k2 +"은 "+ res + "이다");
		
		//	char k3가 A,a 이면 아프리카, B.b 이면  브라질, C,c이면 캐나다, 나머지는 한국
		char	k3	=	'a';
		if	(k3=='A'|| k3=='a')	{
			res	=	"아프리카";
		}	else	if	(k3=='B'||k3=='b')	{
			res	=	"브라질";
		}	else	if	(k3=='C'||k3=='c')	{
			res	=	"캐나다";
		}	else	{
			res	=	"한국";
		}
		System.out.println(k3 +"은 "+ res + "이다");
		
				
		
		//	menu 가 1이면 카페모카가 3500, 2이면 카페라테 4000, 3이면 아메리카노 3000, 
		//	4이면 괴일쥬스 3500 이다, 친구와 2잔을 10000 내고 먹었다.
		//	잔돈은 얼마인가 (단, 부카세 10% 포함)
		int		menu	=	2;		//  주문 상품 번호 
		int		count	=	2;		//	주문수량
		int		input	=	10000;	//	받은 금액 
		
		int		dan		=	0;		//	단가
		int		cost	=	0;		//	가격
		int		change	=	0;		//	잔돈
		
		if	(menu== 1)	{
			res	=	"카페모카";
			dan	=	3500;
		}else	if	(menu==2)	{
			res	=	"카페라테";
			dan	=	4000;
		}else	if	(menu==3)	{
			res	=	"아메리카노";
			dan	=	3000;
		}else	if	(menu==4)	{
			res	=	"과일쥬스";
			dan	=	3500;
		}
		
		cost	=	(int)(dan	* count	* 1.1);  	//  부가세 10% 포함 가격 계산 
		change	=	input	-	cost;				//	잔돈 계산 
		
		System.out.println( res + " " + count +"잔의 부가세 포함 가격은 " + cost + "원 이고 " + "잔돈은 " + change + "원 이다");
		
	}
}
