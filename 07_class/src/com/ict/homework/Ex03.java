package com.ict.homework;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int comWin = 0;
		int userWin = 0;
		
		esc0:
		while (true) {

			System.out.println("======[ 카드 게임 ]=======");

			int comSu = (int) (Math.random() * 13) + 1; // 0 ~ 13 까지의 난수

			Scanner sc = new Scanner(System.in);
			int userSu = 0;

			esc1: while (true) {

				System.out.print("1 ~ 13 까지의 수 >> ");
				userSu = sc.nextInt(); // 화면에서 입력 받음

				if (userSu < 1 || userSu > 13) {
					System.out.println("1 ~ 13 까지의 수 중에서 입력하세요");
				} else {
					break esc1;
				}
			}

			if (comSu > userSu) {
				System.out.println("Compter Win");
				comWin++;
			} else if (comSu < userSu) {
				System.out.println("User Win");
				userWin++;
			} else {
				System.out.println("Equal");
			}
			System.out.println("컴퓨터 수 :" + comSu);

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
		System.out.println("******** The End *********");
		System.out.println("Compter Win : "+ comWin);
		System.out.println("User    Win : "+ userWin);
		
	}
}
