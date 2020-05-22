package com.ict.homework;

import java.util.Random;
import java.util.Scanner;

//	높음, 낮음 
public class Ex02 {

	public static void main(String[] args) {
		
		int		winCnt	=	0;
		int		gameCnt	=	0;
		
		esc0 :
		while (true)	{
			
			Random 	random	=	new Random();
			
			System.out.println();
			System.out.println("======[ 높고 낮음 게임 ]=======");
			gameCnt++;
			int	ransu	=	Math.abs(random.nextInt());
			int	comSu	=	ransu % 2;	

			Scanner	sc	=	new Scanner(System.in);
			int userSu	=	0;
			
			esc1:
			while	(true)	{
				
				System.out.print("0.높음, 1.낮음=> ");
				userSu	=	sc.nextInt();			//	화면에서 입력 받음
				
				switch (userSu) {
				case 0 : 
				case 1 : break esc1;	
				default: System.out.println("0, 1 중에서 입력하세요");
						  break;
				}
			}

			System.out.println();
			System.out.println("컴퓨터 : " + comSu);
			System.out.println("User   : " + userSu);
			
			System.out.println();
			if	(comSu == userSu)	{
				System.out.println("You Win");
				winCnt++;
			}	else	{	
				System.out.println("Computer Win");
			}
			
			System.out.println();
			while	(true)	{
				
				System.out.print("계속하겠습니까? (Y/N) >> ");
				String	con	=	sc.next();
				con	=	con.toUpperCase().trim();	
				
				switch (con.charAt(0)) {
				case 'Y' : continue esc0;
				case 'N' : break esc0;	
				default: System.out.println("잘 못 입력했습니다.");
						  break;
				}
			}
			
		}
		
		System.out.println();
		System.out.println("******** The End *********");
		System.out.println("총 Game 건수 : " + gameCnt);
		System.out.println("이긴    건수 : " + winCnt);

		if (gameCnt > 0) {
			
			double  rate = winCnt / (gameCnt * 1.0) *100;
			double	rate1 = (int)( rate * 10.0 ) / 10.0;
			System.out.println("승률         : " + rate1 + " %");
		}
		
		
		
	}
	
}
