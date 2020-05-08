package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		// do ~ while 문 : while 문과 같은 반복문
		// 초기식 
		// do {
		//    실행문
		//    증감식
		// }while (조건식)
		
		System.out.println("\n\n*** 0 ~ 10 까지 출력");
		int k1 = 0;		
		do {
			System.out.print(k1 +" ");
			k1++;
		} while (k1<11);
		
		
		System.out.println("\n\n*** 0 ~ 10 까지 짝수만 출력");
		int k2 =0;
		do {
			if (k2%2==0) {
				System.out.print(k2 + " ");
			}
			k2++;
		} while (k2 < 11);

		System.out.println("\n\n*** 0 ~ 10 누적합 출력");
		
		int k3 = 0;
		int	sum = 0;
		do {
			sum += k3;
			k3++;
		} while (k3<11);
		System.out.println(sum);
		
		System.out.println("\n*******  5단 출력");
		int k4=1;
		do {
			System.out.println("5 * "+ k4 + " = " + (5*k4) );
			k4++;
		} while (k4<10);
		
		
		System.out.println("=======================");
				
	}
}
