package com.ict.edu;

import java.util.Scanner;

public class Sc07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("입금액 : ");
			int input = sc.nextInt();
			
			System.out.println("메뉴 : 1. 커피음료 (3,500)");
			System.out.println("       2. 이온음료 (2,500)");
			System.out.println("       3. 물       (1,500)");
			System.out.println("       4. 과일쥬스 (4,000)");
			System.out.print("메뉴를 선택하세요  (단, 부가세 포함) : ");
			int	menu = sc.nextInt();
			String 	name = "";
			int 	amt	 = 0;
			
			switch (menu) {
			case 1:
				name 	=  "커피음료";
				amt		=	3500;	
				break;
			case 2:
				name 	=  "이온음료";
				amt		=	2500;	
				break;
			case 3:
				name 	=  "물";
				amt		=	1500;	
				break;
			case 4:
				name 	=  "과일쥬스";
				amt		=	400;	
				break;

			default:
				break;
			}
			
			int vat = (int)(amt * 0.1);
			
			System.out.println("선택한 음료");
			System.out.println("입금액");
			System.out.println("잔돈");
		}
	}

}
