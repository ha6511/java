package com.ict.homework;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int		winCnt	=	0;
		int		gameCnt	=	0;

		esc0:
		while (true) {

			System.out.println();
			System.out.println("======[ 카드 게임 ]=======");

			int comSu = (int) (Math.random() * 13) + 1; // 0 ~ 12 까지의 난수 + 1

			Scanner sc = new Scanner(System.in);
			
			int userSu = 0;

			esc1:
			while	(true)	{
				
				System.out.print("0.낮음, 1.높음=> ");
				userSu	=	sc.nextInt();			//	화면에서 입력 받음
				
				switch (userSu) {
				case 0 : 
				case 1 : break esc1;	
				default: System.out.println("높고 낮음을 선택하세요");
						  break;
				}
			}
			switch (userSu) {
			case 0 : //	 낮음 
				if (comSu > 7) {
					System.out.println("Compter Win");
				} else if (comSu == 7) {
					System.out.println("EQUAL");
				} else	{
					System.out.println("You Win");
					winCnt++;
				}	
				break;
			case 1 : //	 높음 
				if (comSu > 7) {
					System.out.println("You Win");
					winCnt++;
				} else if (comSu == 7) {
					System.out.println("EQUAL");
				} else	{
					System.out.println("Compter Win");
				}	
				break;
			}
			gameCnt++;

			System.out.println("카드값 : " + comSu);

			esc2: while (true) {

				System.out.print("계속하겠습니까? (Y/N) >> ");
				String con = sc.next();
				con = con.toUpperCase().trim();

				switch (con.charAt(0)) {
				case 'Y':
					continue esc0;
				case 'N':
					break esc0;
				default:
					System.out.println("잘 못 입력했습니다.");
					break;
				}
			}
		}
		
		System.out.println();
		System.out.println("******** The End *********");
		System.out.println("Game 건수 : " + gameCnt);
		System.out.println("이긴 건수 : " + winCnt);

		if (gameCnt > 0) {
			
			double  rate = winCnt / (gameCnt * 1.0) *100;
			double	rate1 = (int)( rate * 10.0 ) / 10.0;
			System.out.println("승률      : " + rate1 + " %");
		}
		
		
	}
}
