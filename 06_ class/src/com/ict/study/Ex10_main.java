package com.ict.study;

import java.util.Scanner;

public class Ex10_main {
	
	public static void main(String[] args) {
		
		Ex10[]	arr	=	new	Ex10[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]	=	new Ex10();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 이름 : ");
			arr[i].setName(sc.next());
			
			System.out.print(arr[i].getName() + " 국어점수 : ");
			int kor = sc.nextInt();
			
			System.out.print(arr[i].getName() + " 영어점수 : ");
			int eng = sc.nextInt();

			System.out.print(arr[i].getName() + " 수학점수 : ");
			int math = sc.nextInt();
			
			// 합계
			int	sum =	arr[i].s_sum(kor, eng, math);
			arr[i].setSum(sum);
			
			// 평균
			double avg = arr[i].s_avg(arr[i].getSum());
			arr[i].setAvg(avg);
			
			// 학점 
			String hak = arr[i].s_hak(arr[i].getAvg());
			arr[i].setHak(hak);
			
			System.out.println();
		}
		
		//	등수 구하기 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum())	{
					arr[i].setRank(arr[i].getRank()+1);;
				}
			}
		}
		
		// 정렬하기
		Ex10 temp =	new	Ex10();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank())	{
					temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//	출력하기
		//	출력하기
		System.out.println();
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.print(arr[i].getRank()+"\t");
			System.out.println();
		}
		
	}
}
