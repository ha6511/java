package com.ict.edu;

import java.util.Scanner;

public class Sc07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		esc : 
		while (true) {
			
			System.out.print("\n\n<< 자판기 >>");
			System.out.print("\n\n입금액 : ");
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
				amt		=	4000;	
				break;

			default:
				System.out.println("잘못 선택했습니다.");
				continue esc;
			}
			
			int vat = (int)(amt * 0.1);
			int tot =  amt + vat;
			int output = input - tot;
			
			if (output < 0)	{
				System.out.println("입금액이 "+ (output*-1) + "원 부족합니다. 메뉴금액 : "+ tot);
				continue esc;
			}
			System.out.println();
			System.out.println("입금액 : " + input );
			System.out.println("선택한 음료 : " + name + "("+ amt +"+"+ vat +") = " + tot);
			System.out.println("잔돈 : " + output);
			
			while (true) {
				System.out.print("\n계속할까요? (1:yes, 2:no) : ");
				int con = sc.nextInt();
				if (con == 1) {
					continue esc;
				} else if (con == 2) {
					break esc;
				} else {
				  System.out.println("잘못 입력했습니다.");
				  continue;
				}
			}
			
		}
		
		System.out.println("\n작업 죵료\n");
	}

}
