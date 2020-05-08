package com.ict.edu;

public class Ex06 {
	// 다중 for문 : for 문 안에 다른 for문이 존재하는 것 

	public static void main(String[] args) {
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				
				System.out.println("i="+ i + ", j="+ j);
				
			}
		}
		for (int i = 2; i < 10; i++) {
			System.out.println("\n** " + i +" 단 **");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		for (int i = 2; i < 10; i++) {
			System.out.println("** " + i +" 단 **");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n***** 구구단 *********");
		for (int i = 0; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if	(i==0)	{
					System.out.print(j + " 단\t\t");
					continue;
				}
					
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n************");
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				
				System.out.print("0\t");
			}
			System.out.println();
			
		}

		System.out.println("\n\n************");
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				
				if (i==j) {
					System.out.print("1\t");
				} else {
					System.out.print("0\t");
				}
			}
			System.out.println();
		}
	}
}
