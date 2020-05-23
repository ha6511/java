// 2020-05-13

package com.ict.edu;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		
		//	2020-05-13
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {

			System.out.println();
			
			System.out.print((i+1) + "번째 번호 : ");
			arr[i][0] = sc.nextInt();
			
			// 총점
			System.out.print("국어 점수 : ");
			arr[i][1] = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			arr[i][1] += sc.nextInt();
			
			System.out.print("수학 점수 : ");
			arr[i][1] += sc.nextInt();
			
			// 평균
			arr[i][2] = arr[i][1] / 3;  
			
			// 학점 
			if (arr[i][2] >= 90)	{
				arr[i][3] = 'A';
			} else if (arr[i][2] >= 80)	{
				arr[i][3] = 'B';
			} else if (arr[i][2] >= 70)	{
				arr[i][3] = 'C';
			} else {
				arr[i][3] = 'F';
			}
			
			// 순위
			arr[i][4] = 1; 
		}
		
		// 순위 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("==================");
		
		
		// 정렬
		int[] tmp = new int[5];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
				
		
		//	출력하기
		System.out.println("번호\t총점\t평균\t학점\t순위 ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3 ) {
					System.out.print((char)(arr[i][j]) + "\t");	
				}	else	{
					System.out.print(arr[i][j] + "\t");	
				}
				
			}
			System.out.println();
		}
		
	}
}
