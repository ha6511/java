// 2020-05-14

package com.ict.edu;

import java.util.Scanner;

public class Ex09_main {

	public static void main(String[] args) {
		
		//	5명의 이름, 국어, 영어, 수학 점수를 입력받아서 
		//	이름. 총점, 평균, 학점, 순위를 구하고 정렬하자
		
		Scanner sc = new Scanner(System.in);
		
		Ex09[] arr = new Ex09[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  new Ex09();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println();
			
			System.out.print((i+1) +"번째 이름을 입력하세요 : ");
			String	name	=	sc.next();
			arr[i].setName(name);
			
			System.out.print(arr[i].getName() + "의 국어점수 : ");
			int	kor = sc.nextInt();
			
			System.out.print(arr[i].getName() + "의 영어점수 : ");
			int	eng = sc.nextInt();
			
			System.out.print(arr[i].getName() + "의 수학점수 : ");
			int	math = sc.nextInt();
			
			arr[i].s_sum(kor, eng, math);
			System.out.println(arr[i].getName() + "의 합계 : "+ arr[i].getSum());
			
			arr[i].s_avg();
			System.out.println(arr[i].getName() + "의 평균 : "+ arr[i].getAvg());
			
			arr[i].s_hak();
			System.out.println(arr[i].getName() + "의 학점 : "+ arr[i].getHak());
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum())	{
					arr[i].setRank(arr[i].addRank());
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
		System.out.println("==================");
		
		Ex09 temp = new Ex09();
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
