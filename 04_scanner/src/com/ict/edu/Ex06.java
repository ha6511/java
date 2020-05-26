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
			
			//	이름, 국어, 영어, 수학 정보를 받아서
			//	이름, 총점, 평균(소숫점 첫째자리까지), 학점 출력 

			System.out.println("\n\n<< 성적표 >>\n");
			System.out.print("이름 : ");
			name	=	sc.next();
			
			System.out.print("국어 : ");
			kor		=	sc.nextInt();

			System.out.print("영어 : ");
			eng		=	sc.nextInt();
			
			System.out.print("수학 : ");
			math	=	sc.nextInt();
			
			tot		=	kor + eng + math;
			avg		=	(int)(tot/3.0*10)/10.0;
			
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
		System.out.println("\n작업 죵료\n");
	}
}