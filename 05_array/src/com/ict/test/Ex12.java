package com.ict.test;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][5];
		
		for (int i = 0; i < arr.length; i++) {
			
			int[] tmp = new int[5];
			
			//	번호
			System.out.print((i+1) + "번째 번호 : " );
			tmp[0] = sc.nextInt();
			
			//	합계
			System.out.print( tmp[0] + "의 국어점수 : ");
			tmp[1] = sc.nextInt();
			
			System.out.print( tmp[0] + "의 영어점수 : ");
			tmp[1] += sc.nextInt();
			
			System.out.print( tmp[0] + "의 수학점수 : ");
			tmp[1] += sc.nextInt();
			
			//	평균
			tmp[2]	=	tmp[1] / 3;
			
			//	학점 
			if	(tmp[2] >= 90)	{
				tmp[3] = 'A';
			} else if (tmp[2] >= 80) {
				tmp[3] = 'B';
			} else if (tmp[2] >= 70) {
				tmp[3] = 'C';
			} else  {
				tmp[3] = 'F';
			}
			
			//	순위
			tmp[4] = 1;
			
			arr[i] = tmp;
		}
		//	순위구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][1] < arr[j][1])	{
					arr[i][4]++;
				}
			}
		}
		//	정렬
		int[] tmp = new int[5];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println();
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j==3) {
					System.out.print((char)(arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
}
