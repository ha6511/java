//	2020-05-15

package com.ict.edu;

import java.util.Scanner;

public class Ex12_name {

	public static void main(String[] args) {

		//	5명의 이름, 국어, 영어, 수학 점수를 입력받아서 
		//	이름. 총점, 평균, 학점, 순위를 구하고 정렬하자
		
		Scanner sc = new Scanner(System.in);
		
		Ex12[] arr = new Ex12[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println();
			
			System.out.print((i+1) +"번째 이름을 입력하세요 : ");
			String name = sc.next();
			
			System.out.print(name + "의 국어점수 : ");
			int	kor = sc.nextInt();
			
			System.out.print(name + "의 영어점수 : ");
			int	eng = sc.nextInt();
			
			System.out.print(name + "의 수학점수 : ");
			int	math = sc.nextInt();
			
			//	총점
			int sum = kor + eng + math;
			
			//	평균
			double avg =  (int)((sum / 3.0) * 10) / 10.0;
			
			//	학점
			String hak;
			if (avg>=90) {
				hak = "A";
			} else if (avg>=80) {
				hak = "B";
			} else if (avg>=70) {
				hak = "C";
			} else {
				hak = "F";
			} 
			
			Ex12 person = new Ex12(name, sum, avg, hak, 1);
			
			arr[i] = person;
		}
		
		//	등수구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum())	{
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}

		// 정렬하기 
		Ex12 temp = new Ex12();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank())	{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
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
