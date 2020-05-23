package com.ict.edu;

import java.util.Scanner;

public class Sungjuk {

	final static int PERSON_CNT = 5;
	
	public static void main(String[] args) {
		
		Person[] person = new Person[PERSON_CNT];
		Scanner  sc = new Scanner(System.in);
		
		for (int i = 0; i < person.length; i++) {
			
			Person tmp = new Person();
			
			int num = i + 1;
			
			System.out.print(num + " 번째 이름 : ");
			tmp.setName(sc.next());
			
			System.out.print("국어 성적 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 성적 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 성적 : ");
			int math = sc.nextInt();
			
			System.out.println();
			
			tmp.setSum(kor + eng + math);  // 합계

			tmp.setAvg((int)(tmp.getSum()/3.0 * 10)/10.0);	// 평균 
			
			if      (tmp.getAvg() >= 90) tmp.setHak("A");	// 학점
			else if (tmp.getAvg() >= 80) tmp.setHak("B");
			else if (tmp.getAvg() >= 70) tmp.setHak("C");
			else                         tmp.setHak("F");

			person[i] = tmp;
		}
		
		// 순위 
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person.length; j++) {
				if (person[i].getSum() < person[j].getSum()) {
					person[i].setRank(person[i].getRank()+1);
				}
			}
		}
		
		// 정렬  
		for (int i = 0; i < person.length - 1; i++) {
			for (int j = i; j < person.length; j++) {
				if (person[i].getRank() > person[j].getRank()) {
					Person tmp = new Person();
					tmp = person[i];
					person[i] = person[j];
					person[j] = tmp;
				}
			}
		}

		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < person.length; i++) {
			System.out.print(person[i].getName()+"\t");	
			System.out.print(person[i].getSum()+"\t");	
			System.out.print(person[i].getAvg()+"\t");	
			System.out.print(person[i].getHak()+"\t");	
			System.out.print(person[i].getRank()+"\t");	
			System.out.println();
		}
	}
}
