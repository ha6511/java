package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count1 = 0; // 홀수 갯수
		int count2 = 0;	// 짝수 갯수 
		
		esc :
		while(true) {
			System.out.print("숫자 입력 =>");
			int num = sc.nextInt();
			
			String result = "";		//	홀수, 짝수 구분  
			int conti  = 0;			//	계속진행여부 
			
			
			if (num % 2 == 0) {
				result =  "짝수";
				count2++;
			} else 	{
				result =  "홀수";
				count1++;
			}
			System.out.println(num + "은 "+ result + " 입니다.");
			while(true) {
				System.out.print("계속할까요? (1.yes. 2.no) : ");
				conti = sc.nextInt();
				if (conti == 1)
					continue esc;
				else if (conti == 2)
					break esc	;
				else 
					System.out.println("\n잘못 입력했습니다.");
					continue;
			}
		}
		int sum = count1 + count2;
		System.out.println("\n수고하셨습니다.");
		System.out.println("짝수 : " + count2 );
		System.out.println("홀수 : " + count1 );
		System.out.println("전체 : " + sum );
		
	}
}