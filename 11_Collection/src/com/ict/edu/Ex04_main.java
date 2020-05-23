package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex04_main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashSet<Ex04> person = new HashSet<Ex04>();
		
		
		int		i = 0;
		while(true) {

			Ex04 	tmp 	= 	new Ex04();
			
			System.out.print((i+1) + " 번째 이름 : ");
			tmp.setName( sc.next() );
			
			System.out.print("국어 : ");
			int	kor  = sc.nextInt();
			
			System.out.print("영어 : ");
			int	eng  = sc.nextInt();
			
			System.out.print("수학 : ");
			int	math = sc.nextInt();
			
			tmp.s_Sum(kor, eng, math);
			
			person.add(tmp);
			
			System.out.println("계속할까요?");
			String str = sc.next();
			if (str.equalsIgnoreCase("n")) { 
				break;
			}
		}
		
		System.out.println();
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (Ex04 k : person) {
			System.out.print(k.getName()+"\t"+k.getTot()+"\t"+k.getAvg()+"\t"+k.getHak()+"\t"+k.getRank());
			System.out.println();
		}
		
		//	순위
		for (Ex04 k1 : person) {
			for (Ex04 k2 : person) {
				if (k1.getTot() < k2.getTot())	{
					k1.setRank(k1.getRank()+1);
				}
			}
		}

		//	정렬은 안된다.
		
		//	출력 		
		System.out.println();
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (Ex04 k : person) {
			System.out.print(k.getName()+"\t"+k.getTot()+"\t"+k.getAvg()+"\t"+k.getHak()+"\t"+k.getRank());
			System.out.println();
		}
	
	}

}
