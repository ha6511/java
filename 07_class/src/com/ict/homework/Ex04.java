package com.ict.homework;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		int gameCnt = 0;
		int winCnt = 0;
		int tieCnt = 0;
		int loseCnt = 0;
		int comSu = 0;
		int userSu = 0;
		String comStr = "";
		String userStr = "";
		String statStr = "";

		Scanner sc = new Scanner(System.in);

		esc1: while (true) {

			System.out.println();
			System.out.println("======[ " + (gameCnt + 1) + "차 가위바위보 게임 ]=======");

			comSu = (int) (Math.random() * 3) + 1; // 1 ~ 3
			
			esc2: while (true) {
				
				System.out.print("가위(1), 바위(2), 보(3) 게임종료(0)=> ");
				
				try {
					userSu = sc.nextInt();
				} catch (Exception e) {
					System.out.println("\n숫자를 입력해야 합니다.");
					continue esc2;
				} finally {
					System.out.println("------------------");
				}

				switch (userSu) {
				case 1:
					userStr = "가위";
					break esc2;
				case 2:
					userStr = "바위";
					break esc2;
				case 3:
					userStr = "보";
					break esc2;
				case 0:
					break esc1;
				default:
					System.out.println("다시 선택하세요.");
					break;
				}
			}
			gameCnt++;

			switch (comSu) {
			case 1:
				comStr = "가위";
				switch (userSu) {
				case 1:
					tieCnt++;
					statStr = "비겼습니다.";
					break; // 가위
				case 2:
					winCnt++;
					statStr = "이겼습니다.";
					break; // 바위
				case 3:
					loseCnt++;
					statStr = "졌습니다.";
					break; // 보
				}
				break;
			case 2:
				comStr = "바위";
				switch (userSu) {
				case 1:
					loseCnt++;
					statStr = "졌습니다.";
					break; // 가위
				case 2:
					tieCnt++;
					statStr = "비겼습니다.";
					break; // 바위
				case 3:
					winCnt++;
					statStr = "이겼습니다.";
					break; // 보
				}
				break;
			case 3:
				comStr = "보";
				switch (userSu) {
				case 1:
					winCnt++;
					statStr = "이겼습니다.";
					break; // 가위
				case 2:
					loseCnt++;
					statStr = "졌습니다.";
					break; // 바위
				case 3:
					tieCnt++;
					statStr = "비겼습니다.";
					break; // 보
				}
				break;
			}
			if (statStr.equals("비겼습니다.")) {
				System.out.print("컴퓨터 와 당신 모두 " + comStr + " 입니다.\n");
			} else {
				System.out.print("컴퓨터 는 " + comStr + " 이고 ");
				System.out.print("당신 은 " + userStr + " 입니다.\n");
			}
			System.out.println(statStr);
		}

		System.out.println();
		System.out.println("************** 게임 정산 ********************");
		System.out.println("게임 건수 : " + gameCnt);
		System.out.println("---------------------------------------------");
		System.out.println("이긴 건수 : " + winCnt);
		System.out.println("비긴 건수 : " + tieCnt);
		System.out.println("진   건수 : " + loseCnt);
		System.out.println("---------------------------------------------");

		if (gameCnt > 0) {

			double rate1 = winCnt / (gameCnt * 1.0) * 100;
			double rate2 = (int) (rate1 * 10.0) / 10.0;
			System.out.println("승률      : " + rate2 + " %");
		}
		System.out.println("=============================================");

	}
}
