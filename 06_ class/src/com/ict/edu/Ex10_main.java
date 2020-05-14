// 2020-05-14

package com.ict.edu;

import java.util.Scanner;

public class Ex10_main {

	public static void main(String[] args) {
		
		//	5명의 이름, 국어, 영어, 수학 점수를 입력받아서 
		//	이름. 총점, 평균, 학점, 순위를 구하고 정렬하자
		
		Scanner sc = new Scanner(System.in);
		
		Ex10[] arr = new Ex10[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  new Ex10();
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
			
			//	총점
			int 	sum = arr[i].s_sum(kor, eng, math);
			arr[i].setSum(sum);
			
			//	평균
			double	avg = arr[i].s_avg(sum);
			arr[i].setAvg(avg);
			
			//	학점
			String	hak	= arr[i].s_hak(avg);
			arr[i].setHak(hak);
		}
		
		//	등수구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum())	{
					arr[i].setRank(arr[i].addRank());
				}
			}
		}

		// 정렬하기 
		Ex10 temp = new Ex10();
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
