package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String 	name 	= 	"";
		int		kor		=	0;
		int		eng		=	0;
		int		math	=	0;
		
		int		tot		=	0;
		double	avg		=	0;
		String	hak		=	"";
		
		esc : while(true) {

			System.out.print("이름 : ");
			name	=	sc.next();
			
			System.out.print("국어 : ");
			kor		=	sc.nextInt();

			System.out.print("영어 : ");
			eng		=	sc.nextInt();
			
			System.out.print("수학 : ");
			math	=	sc.nextInt();
			
			tot		=	kor + eng + math;
			avg		=	(int)(( (tot / 3) * 10) * 0.1 );
			
			if (avg >= 90) {
				hak = "A 학점";
			}
			else if (avg >= 80) {
				hak = "B 학점";
			}
			else if (avg >= 70) {
				hak = "C 학점";
			}
			else {
				hak = "F 학점";
			}
			
			System.out.println();
			System.out.println("이름 : "+ name);
			System.out.println("총점 : "+ tot);
			System.out.println("평균 : "+ avg);
			System.out.println("학점 : "+ hak);
			while (true) {
				System.out.print("\n계속할까요? (1:yes, 2:no)");
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
		System.out.println("작업 죵료");
	}
}
