package com.ict.study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex04_main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Ex04> person = new HashSet<Ex04>();
		
		int i = 0;
		while (true) {
			
			Ex04	tmp	=	new Ex04();
			i++;

			System.out.print(i + " 번째 이름 : ");
			tmp.setName(sc.next());
			
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			//	합계
			tmp.setTot(kor + eng + math);
			
			//	평균
			tmp.setAvg((int)(tmp.getTot()/3.0*10)/10 );
			
			//  학점
			if (tmp.getTot() >= 90) tmp.setHak("A");
			else if (tmp.getTot() >= 80) tmp.setHak("B");
			else if (tmp.getTot() >= 70) tmp.setHak("C");
			else tmp.setHak("F");
			
			person.add(tmp);
			
			System.out.print("계속할까요? ");
			String con =  sc.next();
			if (con.equalsIgnoreCase("n")) {
				break;
			}
				
		}
		
		for (Ex04 k1 : person) {
			for (Ex04 k2 : person) {
				if (k1.getTot() < k2.getTot()) {
					k1.setRank(k1.getRank()+1);
				}
			}
		}

		Ex04[] ex04 = new Ex04[person.size()];

		Iterator<Ex04> per = person.iterator();
		
		while (per.hasNext()) {
			Ex04 sel = (Ex04) per.next();
			
		}
		
		
		
		
		System.out.println();
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (Ex04 F : person) {
			System.out.print(F.getName() + "\t");
			System.out.print(F.getTot() + "\t");
			System.out.print(F.getAvg() + "\t");
			System.out.print(F.getHak() + "\t");
			System.out.print(F.getRank());
			System.out.println();
		}
		
		
		
		
		
	}

}
